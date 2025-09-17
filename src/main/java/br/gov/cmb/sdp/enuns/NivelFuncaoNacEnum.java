package br.gov.cmb.sdp.enuns;

public enum NivelFuncaoNacionalEnum {

	N1("N1", "Primeiro Nível"), N2("N2", "Segundo Nível/Consultor Sênior"),
	N3("N3", "Terceiro Nével/Técnico Especialista/Consultor"), N0("N0", "Presidente/Diretores/Membros dos Conselhos");

	private String codigo;
	private String descricao;

	NivelFuncaoNacionalEnum() {
	}

	NivelFuncaoNacionalEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getString() {
		return this.descricao;
	}

	public String getCodigo() {
		return this.codigo;
	}

	@Override
	public String toString() {
		return this.descricao;
	}

}
