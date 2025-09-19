package br.gov.cmb.sdp.dto;

import br.gov.cmb.sdp.enuns.NivelFuncaoInternacionalEnum;
import br.gov.cmb.sdp.enuns.NivelFuncaoNacionalEnum;
import br.gov.cmb.sdp.enuns.TipoFuncaoEnum;

public class FuncaoDTO {
	
	private Long id;
	private TipoFuncaoEnum tipoFuncao;
	private Long idGrupoFuncaoNac;
	private Long idGrupoFuncaoInt;
	private NivelFuncaoNacionalEnum nivelFuncaoNac;
	private NivelFuncaoInternacionalEnum nivelFuncaoInt;
		
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
	public Long getIdGrupoFuncaoNac() {
		return idGrupoFuncaoNac;
	}
	public void setIdGrupoFuncaoNac(Long idGrupoFuncaoNac) {
		this.idGrupoFuncaoNac = idGrupoFuncaoNac;
	}
	public Long getIdGrupoFuncaoInt() {
		return idGrupoFuncaoInt;
	}
	public void setIdGrupoFuncaoInt(Long idGrupoFuncaoInt) {
		this.idGrupoFuncaoInt = idGrupoFuncaoInt;
	}
	public NivelFuncaoNacionalEnum getNivelFuncaoNac() {
		return nivelFuncaoNac;
	}
	public void setNivelFuncaoNac(NivelFuncaoNacionalEnum nivelFuncaoNac) {
		this.nivelFuncaoNac = nivelFuncaoNac;
	}
	public NivelFuncaoInternacionalEnum getNivelFuncaoInt() {
		return nivelFuncaoInt;
	}
	public void setNivelFuncaoInt(NivelFuncaoInternacionalEnum nivelFuncaoInt) {
		this.nivelFuncaoInt = nivelFuncaoInt;
	}
}
