package br.gov.cmb.sdp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.cmb.sdp.entity.Funcao;
import br.gov.cmb.sdp.enuns.TipoFuncaoEnum;

public interface FuncaoRepository extends JpaRepository<Funcao, Long>{
	
	Optional<Funcao> findByTipoFuncao(TipoFuncaoEnum tipoFuncao);

}
