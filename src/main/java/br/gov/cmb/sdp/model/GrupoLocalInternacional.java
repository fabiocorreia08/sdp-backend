package br.gov.cmb.sdp.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "GRUPO_LOCAL_INT")
public class GrupoLocalInternacional implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRUPO_LOCAL_INT", nullable = false, unique = true, length = 5)
	private Long id;

	@Column(name = "TX_NOME_GRUPO", nullable = false, length = 50, unique = true)
	private String nomeGrupo;
	
	@OneToMany(targetEntity = LocalInternacional.class, cascade = CascadeType.ALL, mappedBy = "grupoLocalInt")
	private List<LocalInternacional> locaisInt;

}
