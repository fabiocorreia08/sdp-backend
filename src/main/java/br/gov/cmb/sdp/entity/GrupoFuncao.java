package br.gov.cmb.sdp.entity;

import java.io.Serializable;

import org.hibernate.envers.Audited;

import br.gov.cmb.sdp.enuns.TipoGrupoFuncaoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GRUPO_FUNCAO")
@Audited
public class GrupoFuncao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRUPO_FUNCAO", unique = true, nullable = false, length = 5)
	private Long id;
	
	@Column(name = "TX_NOME_GRUPO", nullable = false, length = 255, unique = true)
    private String nomeGrupo;
		
	@Enumerated(EnumType.STRING)
    @Column(name = "TX_TIPO_GRUPO_FUNCAO", nullable = false, length = 3)
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
