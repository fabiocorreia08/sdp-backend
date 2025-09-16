package br.gov.cmb.sdp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuncaoDTO {
	
	private Long id;	
	private String tipoFuncao;
	private String grupoFuncaoNacional;
	private String grupoFuncaoInternacional;
	private String nivelFuncaoNacional;
	private String nivelFuncaoInternacional;

}
