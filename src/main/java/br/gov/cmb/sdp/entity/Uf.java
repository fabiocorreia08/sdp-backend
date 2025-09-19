package br.gov.cmb.sdp.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "VW_UF")
public class Uf implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_UF", nullable = true, insertable = false, updatable = false, length = 2)
	private String cod;

	@Column(name = "DESC_UF", nullable = true, insertable = false, updatable = false)
	private String descUf;

	@OneToMany(targetEntity = Municipio.class, cascade = CascadeType.ALL, mappedBy = "uf")
	@OrderBy("descricaoMunicipio ASC")	
	private List<Municipio> municipio;
}
