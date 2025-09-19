package br.gov.cmb.sdp.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "VW_MUNICIPIO")
public class Municipio implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, length = 5, insertable = false, updatable = false)
	private Long id;

	@Column(name = "COD_MUN", nullable = false, length = 8, insertable = false, updatable = false)
	private String codigoMunicipio;

	@Column(name = "COD_UF", nullable = false, length = 8, insertable = false, updatable = false)
	private String codigoUf;

	@Column(name = "DESC_MUN", nullable = false, length = 50, insertable = false, updatable = false)
	@OrderBy("descricaoMunicipio ASC")	
	private String descricaoMunicipio;

	@ManyToOne(targetEntity = Uf.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "COD_UF", nullable = false, insertable = false, updatable = false)
	private Uf uf;
	
}
