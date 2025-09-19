package br.gov.cmb.sdp.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VW_PAISES")
public class Pais implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID_PAIS", nullable = false, length = 5, insertable = false, updatable = false)
    private Long id;

    @Column(name = "CODIGO", nullable = true, length = 8, insertable = false, updatable = false)
    private String codigoPais;

    @Column(name = "NOME", nullable = true, length = 50, insertable = false, updatable = false)
    private String descricaoPais;
	
}
