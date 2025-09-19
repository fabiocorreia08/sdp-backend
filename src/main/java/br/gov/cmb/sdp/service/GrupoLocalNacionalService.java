package br.gov.cmb.sdp.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.gov.cmb.sdp.dto.GrupoFuncaoDTO;
import br.gov.cmb.sdp.entity.GrupoFuncao;
import br.gov.cmb.sdp.repository.GrupoFuncaoRepository;

@Service
public class GrupoLocalNacionalService extends AbstractService<GrupoFuncao, GrupoFuncaoDTO, Long>{	

	public GrupoLocalNacionalService(GrupoFuncaoRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }

    @Override
    protected Class<GrupoFuncao> getEntityClass() {
        return GrupoFuncao.class;
    }

    @Override
    protected Class<GrupoFuncaoDTO> getDtoClass() {
        return GrupoFuncaoDTO.class;
    }

}
