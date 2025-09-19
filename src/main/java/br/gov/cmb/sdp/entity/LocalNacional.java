package br.gov.cmb.sdp.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOCAL_NACIONAL")
public class LocalNacional implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LOCAL_NACIONAL", nullable = false, unique = true, length = 5)
	private Long id;

	@ManyToOne(targetEntity = GrupoLocalNacional.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_GRUPO_LOCAL_NACIONAL", nullable = true, insertable = true, updatable = true)
	private GrupoLocalNacional grupoLocalNacional;

	@ManyToOne(targetEntity = Uf.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "COD_UF", nullable = true)
	private Uf uf;

}
