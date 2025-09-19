package br.gov.cmb.sdp.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.gov.cmb.sdp.dto.GrupoLocalInternacionalDTO;
import br.gov.cmb.sdp.model.GrupoLocalInternacional;
import br.gov.cmb.sdp.repository.GrupoLocalInternacionalRepository;

@Service
public class GrupoLocalInternacionalService extends AbstractService<GrupoLocalInternacional, GrupoLocalInternacionalDTO, Long>{	

	public GrupoLocalInternacionalService(GrupoLocalInternacionalRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }

    @Override
    protected Class<GrupoLocalInternacional> getEntityClass() {
        return GrupoLocalInternacional.class;
    }

    @Override
    protected Class<GrupoLocalInternacionalDTO> getDtoClass() {
        return GrupoLocalInternacionalDTO.class;
    }

}
