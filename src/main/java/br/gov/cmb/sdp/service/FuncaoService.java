package br.gov.cmb.sdp.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.gov.cmb.sdp.dto.FuncaoDTO;
import br.gov.cmb.sdp.model.Funcao;
import br.gov.cmb.sdp.repository.FuncaoRepository;

@Service
public class FuncaoService extends AbstractService<Funcao, FuncaoDTO, Long>{	

	public FuncaoService(FuncaoRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }

    @Override
    protected Class<Funcao> getEntityClass() {
        return Funcao.class;
    }

    @Override
    protected Class<FuncaoDTO> getDtoClass() {
        return FuncaoDTO.class;
    }

}
