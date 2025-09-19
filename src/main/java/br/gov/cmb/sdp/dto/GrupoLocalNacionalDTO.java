package br.gov.cmb.sdp.dto;

import br.gov.cmb.sdp.enuns.TipoGrupoFuncaoEnum;

public class GrupoLocalNacionalDTO {
	
	private Long id;
	private String nomeGrupo;
	private TipoGrupoFuncaoEnum tipoGrupoFuncao;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeGrupo() {
		return nomeGrupo;
	}
	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}
	public TipoGrupoFuncaoEnum getTipoGrupoFuncao() {
		return tipoGrupoFuncao;
	}
	public void setTipoGrupoFuncao(TipoGrupoFuncaoEnum tipoGrupoFuncao) {
		this.tipoGrupoFuncao = tipoGrupoFuncao;
	}
	
}
