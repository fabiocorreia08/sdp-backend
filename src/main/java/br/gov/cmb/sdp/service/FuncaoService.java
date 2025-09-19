package br.gov.cmb.sdp.service;

import java.util.Optional;

import br.gov.cmb.sdp.dto.FuncaoDTO;
import br.gov.cmb.sdp.entity.Funcao;
import br.gov.cmb.sdp.enuns.TipoFuncaoEnum;

public interface FuncaoService extends GenericService<Funcao, FuncaoDTO, Long> {
	
    Optional<FuncaoDTO> buscarPorTipoFuncao(TipoFuncaoEnum tipoFuncao);
}

