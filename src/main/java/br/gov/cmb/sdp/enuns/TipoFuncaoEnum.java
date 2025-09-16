package br.gov.cmb.sdp.enuns;

public enum TipoFuncaoEnum {

	NS("NS", "Possui Nível Superior"), NT("NT", "Possui Nível Técnico"), FC("FC", "Possui Função");

	private String codigo;
	private String descricao;

	TipoFuncaoEnum() {
	}

	TipoFuncaoEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return this.descricao;
	}

}
