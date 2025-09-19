package br.gov.cmb.sdp.model;

import java.io.Serializable;

import br.gov.cmb.sdp.enuns.NivelFuncaoInternacionalEnum;
import br.gov.cmb.sdp.enuns.NivelFuncaoNacionalEnum;
import br.gov.cmb.sdp.enuns.TipoFuncaoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//@Audited
@Entity
@Table(name = "FUNCAO")
public class Funcao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FUNCAO", unique = true, nullable = false, precision = 19)
	private Long id;
	
	@Enumerated(EnumType.STRING)
    @Column(name = "TX_TIPO_FUNCAO", nullable = false, length = 2)    
	private TipoFuncaoEnum tipoFuncao;
	
	//@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	@ManyToOne(targetEntity = GrupoFuncao.class)    
    @JoinColumn(name = "ID_GRUPO_FUNCAO_NAC", nullable = true, insertable = true, updatable = true)    
	private GrupoFuncao grupoFuncaoNac;
	
	//@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	@ManyToOne(targetEntity = GrupoFuncao.class)    
	@JoinColumn(name = "ID_GRUPO_FUNCAO_INT", nullable = true, insertable = true, updatable = true)    
	private GrupoFuncao grupoFuncaoInt;
		
	@Enumerated(EnumType.STRING)
    @Column(name = "TX_NIVEL_FUNCAO_NAC", nullable = true, length = 2)    
	private NivelFuncaoNacionalEnum nivelFuncaoNac;
	
	@Enumerated(EnumType.STRING)
    @Column(name = "TX_NIVEL_FUNCAO_INT", nullable = true, length = 2)   
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

	public GrupoFuncao getGrupoFuncaoNac() {
		return grupoFuncaoNac;
	}

	public void setGrupoFuncaoNac(GrupoFuncao grupoFuncaoNac) {
		this.grupoFuncaoNac = grupoFuncaoNac;
	}

	public GrupoFuncao getGrupoFuncaoInt() {
		return grupoFuncaoInt;
	}

	public void setGrupoFuncaoInt(GrupoFuncao grupoFuncaoInt) {
		this.grupoFuncaoInt = grupoFuncaoInt;
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
