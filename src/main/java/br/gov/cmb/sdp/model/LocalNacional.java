package br.gov.cmb.sdp.model;

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
@Table(name = "LOCAL_NAC")
public class LocalNacional implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LOCAL", nullable = false, unique = true, length = 5)
	private Long id;

	@ManyToOne(targetEntity = GrupoLocalNacional.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_GRUPO_LOCAL_NAC", nullable = true, insertable = true, updatable = true)
	private GrupoLocalNacional grupoLocalNac;

	@ManyToOne(targetEntity = Uf.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "COD_UF", nullable = true)
	private Uf uf;

}
