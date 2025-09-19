package br.gov.cmb.sdp.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.gov.cmb.sdp.dto.FuncaoDTO;
import br.gov.cmb.sdp.entity.Funcao;
import br.gov.cmb.sdp.enuns.TipoFuncaoEnum;
import br.gov.cmb.sdp.repository.FuncaoRepository;

import java.util.Optional;

@Service
public class FuncaoServiceImpl extends AbstractService<Funcao, FuncaoDTO, Long> implements FuncaoService {

    private final FuncaoRepository repository;

    public FuncaoServiceImpl(FuncaoRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
        this.repository = repository;
    }

    @Override
    protected Class<Funcao> getEntityClass() {
        return Funcao.class;
    }

    @Override
    protected Class<FuncaoDTO> getDtoClass() {
        return FuncaoDTO.class;
    }

    @Override
    public Optional<FuncaoDTO> buscarPorTipoFuncao(TipoFuncaoEnum tipoFuncao) {
        return repository.findByTipoFuncao(tipoFuncao)
                .map(this::convertToDto);
    }
}
