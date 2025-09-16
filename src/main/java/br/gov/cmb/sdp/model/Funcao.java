package br.gov.cmb.sdp.model;

import java.io.Serializable;

import br.gov.cmb.sdp.enuns.NivelFuncaoInternacionalEnum;
import br.gov.cmb.sdp.enuns.NivelFuncaoNacionalEnum;
import br.gov.cmb.sdp.enuns.TipoFuncaoEnum;
import jakarta.persistence.CascadeType;
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Audited
@Data
@NoArgsConstructor
@AllArgsConstructor
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
	@ManyToOne(targetEntity = GrupoFuncao.class, cascade = CascadeType.ALL)    
    @JoinColumn(name = "ID_GRUPO_FUNCAO_NACIONAL", nullable = true, insertable = true, updatable = true)    
	private GrupoFuncao grupoFuncaoNacional;
	
	//@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	@ManyToOne(targetEntity = GrupoFuncao.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_GRUPO_FUNCAO_INTERNACIONAL", nullable = true, insertable = true, updatable = true)
	private GrupoFuncao grupoFuncaoInternacional;
	
	@Enumerated(EnumType.STRING)
    @Column(name = "TX_NIVEL_FUNCAO_NACIONAL", nullable = true, length = 2)    
	private NivelFuncaoNacionalEnum nivelFuncaoNacional;
	
	@Enumerated(EnumType.STRING)
    @Column(name = "TX_NIVEL_FUNCAO_INTERNACIONAL", nullable = true, length = 2)   
	private NivelFuncaoInternacionalEnum nivelFuncaoInternacional;
	
}
