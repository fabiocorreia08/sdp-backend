package br.gov.cmb.sdp.entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.envers.Audited;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "GRUPO_LOCAL_INTERNACIONAL")
@Audited
public class GrupoLocalInternacional implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRUPO_LOCAL_INTERNACIONAL", nullable = false, unique = true, length = 5)
	private Long id;

	@Column(name = "TX_NOME_GRUPO", nullable = false, length = 50, unique = true)
	private String nomeGrupo;
	
	@OneToMany(targetEntity = LocalInternacional.class, cascade = CascadeType.ALL, mappedBy = "grupoLocalInternacional")
	private List<LocalInternacional> locaisInternacional;

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

	public List<LocalInternacional> getLocaisInternacional() {
		return locaisInternacional;
	}

	public void setLocaisInternacional(List<LocalInternacional> locaisInternacional) {
		this.locaisInternacional = locaisInternacional;
	}

}
