package br.gov.cmb.sdp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class FuncaoDTO {
	
	private Long id;	
	private String tipoFuncao;
	private String grupoFuncaoNacional;
	private String grupoFuncaoInternacional;
	private String nivelFuncaoNacional;
	private String nivelFuncaoInternacional;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoFuncao() {
		return tipoFuncao;
	}
	public void setTipoFuncao(String tipoFuncao) {
		this.tipoFuncao = tipoFuncao;
	}
	public String getGrupoFuncaoNacional() {
		return grupoFuncaoNacional;
	}
	public void setGrupoFuncaoNacional(String grupoFuncaoNacional) {
		this.grupoFuncaoNacional = grupoFuncaoNacional;
	}
	public String getGrupoFuncaoInternacional() {
		return grupoFuncaoInternacional;
	}
	public void setGrupoFuncaoInternacional(String grupoFuncaoInternacional) {
		this.grupoFuncaoInternacional = grupoFuncaoInternacional;
	}
	public String getNivelFuncaoNacional() {
		return nivelFuncaoNacional;
	}
	public void setNivelFuncaoNacional(String nivelFuncaoNacional) {
		this.nivelFuncaoNacional = nivelFuncaoNacional;
	}
	public String getNivelFuncaoInternacional() {
		return nivelFuncaoInternacional;
	}
	public void setNivelFuncaoInternacional(String nivelFuncaoInternacional) {
		this.nivelFuncaoInternacional = nivelFuncaoInternacional;
	}
}
