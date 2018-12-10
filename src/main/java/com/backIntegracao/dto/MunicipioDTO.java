package com.backIntegracao.dto;

import com.backIntegracao.domain.Municipio;

public class MunicipioDTO {
	
	private String id_municipio;
	private String no_municipio;
	
	public MunicipioDTO() {}
	
	public MunicipioDTO(Municipio municipio) {
		super();
		this.id_municipio = municipio.getId_municipio();
		this.no_municipio = municipio.getNo_municipio();
	}


	public String getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(String id_municipio) {
		this.id_municipio = id_municipio;
	}

	public String getNo_municipio() {
		return no_municipio;
	}
	public void setNo_municipio(String no_municipio) {
		this.no_municipio = no_municipio;
	}
	
	

}
