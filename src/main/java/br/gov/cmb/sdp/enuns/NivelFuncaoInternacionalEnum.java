package br.gov.cmb.sdp.enuns;

public enum NivelFuncaoIntEnum {

	N1("N1", "Diretores/Membros dos Conselhos"), N2("N2", "Primeiro Nível"), N3("N3", "Segundo Nível/Consultor Sênior"),
	N4("N4", "Terceiro Nível/Técnico Especialista/Consultor"), N0("N0", "Presidente");

	private String codigo;
	private String descricao;

	public String getString() {
		return this.descricao;
	}

	public String getCodigo() {
		return this.codigo;
	}

	NivelFuncaoIntEnum() {
	}

	NivelFuncaoIntEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return this.descricao;
	}

}
