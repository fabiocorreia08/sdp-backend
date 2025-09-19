package br.gov.cmb.sdp.dto;

import br.gov.cmb.sdp.enuns.NivelFuncaoInternacionalEnum;
import br.gov.cmb.sdp.enuns.NivelFuncaoNacionalEnum;
import br.gov.cmb.sdp.enuns.TipoFuncaoEnum;

public class FuncaoDTO {
	
	private Long id;
	private TipoFuncaoEnum tipoFuncao;
	private Long idGrupoFuncaoNacional;
	private Long idGrupoFuncaoInternacional;
	private NivelFuncaoNacionalEnum nivelFuncaoNacional;
	private NivelFuncaoInternacionalEnum nivelFuncaoInternacional;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoFuncaoEnum getTipoFuncao() {
		return tipoFuncao;
	}
	public void setTipoFuncao(TipoFuncaoEnum tipoFuncao) {
		this.tipoFuncao = tipoFuncao;
	}
	public Long getIdGrupoFuncaoNacional() {
		return idGrupoFuncaoNacional;
	}
	public void setIdGrupoFuncaoNacional(Long idGrupoFuncaoNacional) {
		this.idGrupoFuncaoNacional = idGrupoFuncaoNacional;
	}
	public Long getIdGrupoFuncaoInternacional() {
		return idGrupoFuncaoInternacional;
	}
	public void setIdGrupoFuncaoInternacional(Long idGrupoFuncaoInternacional) {
		this.idGrupoFuncaoInternacional = idGrupoFuncaoInternacional;
	}
	public NivelFuncaoNacionalEnum getNivelFuncaoNacional() {
		return nivelFuncaoNacional;
	}
	public void setNivelFuncaoNacional(NivelFuncaoNacionalEnum nivelFuncaoNacional) {
		this.nivelFuncaoNacional = nivelFuncaoNacional;
	}
	public NivelFuncaoInternacionalEnum getNivelFuncaoInternacional() {
		return nivelFuncaoInternacional;
	}
	public void setNivelFuncaoInternacional(NivelFuncaoInternacionalEnum nivelFuncaoInternacional) {
		this.nivelFuncaoInternacional = nivelFuncaoInternacional;
	}	
}
