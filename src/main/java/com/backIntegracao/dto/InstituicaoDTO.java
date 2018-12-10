package com.backIntegracao.dto;

import com.backIntegracao.domain.Instituicao;

public class InstituicaoDTO {
	
	private String id_unidade;
	private String nu_cnpj_cpf;
	private String no_razao_social;
	private String no_fantasia;
	private String endereco;
	private String no_bairro;
	private String cep;
	private Integer id_tipo_unidade;
	private String id_municipio;
	
	public InstituicaoDTO() {}

	public InstituicaoDTO(Instituicao instituicao) {
		super();
		this.id_unidade = instituicao.getId_unidade();
		this.nu_cnpj_cpf = instituicao.getNu_cnpj_cpf();
		this.no_razao_social = instituicao.getNo_razao_social();
		this.no_fantasia = instituicao.getNo_fantasia();
		this.endereco = instituicao.getEndereco();
		this.no_bairro = instituicao.getNo_bairro();
		this.cep = instituicao.getCep();
		this.id_tipo_unidade = instituicao.getTipoInstituicao().getId_tipo_unidade();
		this.id_municipio = instituicao.getMunicipio().getId_municipio();
	}

	public String getId_unidade() {
		return id_unidade;
	}

	public void setId_unidade(String id_unidade) {
		this.id_unidade = id_unidade;
	}

	public String getNu_cnpj_cpf() {
		return nu_cnpj_cpf;
	}

	public void setNu_cnpj_cpf(String nu_cnpj_cpf) {
		this.nu_cnpj_cpf = nu_cnpj_cpf;
	}

	public String getNo_razao_social() {
		return no_razao_social;
	}

	public void setNo_razao_social(String no_razao_social) {
		this.no_razao_social = no_razao_social;
	}

	public String getNo_fantasia() {
		return no_fantasia;
	}

	public void setNo_fantasia(String no_fantasia) {
		this.no_fantasia = no_fantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNo_bairro() {
		return no_bairro;
	}

	public void setNo_bairro(String no_bairro) {
		this.no_bairro = no_bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getId_tipo_unidade() {
		return id_tipo_unidade;
	}

	public void setId_tipo_unidade(Integer id_tipo_unidade) {
		this.id_tipo_unidade = id_tipo_unidade;
	}

	public String getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(String id_municipio) {
		this.id_municipio = id_municipio;
	}

	
	
	
	

}
