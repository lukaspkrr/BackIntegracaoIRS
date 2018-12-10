package com.backIntegracao.dto;

import java.io.Serializable;

import com.backIntegracao.domain.Estado;

public class EstadoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id_uf;
	private String uf_sigla;
	private String no_uf;
	
	public EstadoDTO() {}
	
	public EstadoDTO(Estado estado) {
		super();
		this.id_uf = estado.getId_uf();
		this.uf_sigla = estado.getUf_sigla();
		this.no_uf = estado.getNo_uf();
	}

	public String getId_uf() {
		return id_uf;
	}

	public void setId_uf(String id_uf) {
		this.id_uf = id_uf;
	}

	public String getUf_sigla() {
		return uf_sigla;
	}

	public void setUf_sigla(String uf_sigla) {
		this.uf_sigla = uf_sigla;
	}

	public String getNo_uf() {
		return no_uf;
	}

	public void setNo_uf(String no_uf) {
		this.no_uf = no_uf;
	}
	
	
}
