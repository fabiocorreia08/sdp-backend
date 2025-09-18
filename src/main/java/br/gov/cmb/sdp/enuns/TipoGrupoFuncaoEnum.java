package br.gov.cmb.sdp.enuns;

public enum TipoGrupoFuncaoEnum {

	NAC("NAC", "Nacional"), INT("INT", "Internacional");

	private String codigo;
	private String descricao;

	public String getString() {
		return this.descricao;
	}

	public String getCodigo() {
		return this.codigo;
	}

	TipoGrupoFuncaoEnum() {
	}

	TipoGrupoFuncaoEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return this.codigo;
	}

}
