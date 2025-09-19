package br.gov.cmb.sdp.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<T, D, I> implements GenericService<T, D, I> {

    protected final JpaRepository<T, I> repositorio;
    protected final ModelMapper modelMapper;

    protected AbstractService(JpaRepository<T, I> repositorio, ModelMapper modelMapper) {
        this.repositorio = repositorio;
        this.modelMapper = modelMapper;
    }

    protected abstract Class<T> getEntityClass();
    protected abstract Class<D> getDtoClass();

    @Override
    public D buscarPorId(I id) {
        T entity = repositorio.findById(id)
            .orElseThrow(() -> new RuntimeException("Recurso não encontrado com ID: " + id));
        return convertToDto(entity);
    }

    @Override
    public List<D> buscarTodos() {
        return repositorio.findAll().stream().map(this::convertToDto).toList();
    }

    @Override
    public Page<D> buscarTodos(Pageable pageable) {
        return repositorio.findAll(pageable).map(this::convertToDto);
    }

    @Override
    public D salvar(D dto) throws Exception {
        T entity = convertToEntity(dto);
        return convertToDto(repositorio.save(entity));
    }

    @Override
    public D atualizar(I id, D dto) {
        T entity = convertToEntity(dto);
        return convertToDto(repositorio.save(entity));
    }

    @Override
    public void deletar(I id) {
        repositorio.deleteById(id);
    }

    protected T convertToEntity(D dto) {
        return modelMapper.map(dto, getEntityClass());
    }

    protected D convertToDto(T entity) {
        return modelMapper.map(entity, getDtoClass());
    }
}