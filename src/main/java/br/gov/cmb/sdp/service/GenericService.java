package br.gov.cmb.sdp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GenericService<T, D, I> {
    D buscarPorId(I id);
    Page<D> buscarTodos(Pageable pageable);
    List<D> buscarTodos();
    D salvar(D dto) throws Exception;
    D atualizar(I id, D dto);
    void deletar(I id);
}
