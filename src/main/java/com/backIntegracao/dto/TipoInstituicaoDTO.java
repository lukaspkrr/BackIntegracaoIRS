package com.backIntegracao.dto;

import java.io.Serializable;

import com.backIntegracao.domain.TipoInstituicao;

public class TipoInstituicaoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id_tipo_unidade;
	private String ds_tipo_unidade;
	
	public TipoInstituicaoDTO() {}
	
	public TipoInstituicaoDTO(TipoInstituicao obj) {
		super();
		this.id_tipo_unidade = obj.getId_tipo_unidade();
		this.ds_tipo_unidade = obj.getDs_tipo_unidade();
	}

	public Integer getId_tipo_unidade() {
		return id_tipo_unidade;
	}

	public void setId_tipo_unidade(Integer id_tipo_unidade) {
		this.id_tipo_unidade = id_tipo_unidade;
	}

	public String getDs_tipo_unidade() {
		return ds_tipo_unidade;
	}

	public void setDs_tipo_unidade(String ds_tipo_unidade) {
		this.ds_tipo_unidade = ds_tipo_unidade;
	}
	
	

}
