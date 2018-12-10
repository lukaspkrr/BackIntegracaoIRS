package com.backIntegracao.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="td_instituicao", catalog ="dfdwp")
public class Instituicao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id_unidade;
	private String nu_cnpj_cpf;
	private String no_razao_social;
	private String no_fantasia;
	private String endereco;
	private String no_bairro;
	private String cep;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_unidade")
	private TipoInstituicao tipoInstituicao;
	
	@ManyToOne
	@JoinColumn(name="id_municipio")
	private Municipio municipio;
	
	public Instituicao() {}

	public Instituicao(String id_unidade, String nu_cnpj_cpf, String no_razao_social, String no_fantasia,
			String endereco, String no_bairro, String cep, TipoInstituicao tipoInstituicao, Municipio municipio) {
		super();
		this.id_unidade = id_unidade;
		this.nu_cnpj_cpf = nu_cnpj_cpf;
		this.no_razao_social = no_razao_social;
		this.no_fantasia = no_fantasia;
		this.endereco = endereco;
		this.no_bairro = no_bairro;
		this.cep = cep;
		this.tipoInstituicao = tipoInstituicao;
		this.municipio = municipio;
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





	public TipoInstituicao getTipoInstituicao() {
		return tipoInstituicao;
	}





	public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
		this.tipoInstituicao = tipoInstituicao;
	}





	public Municipio getMunicipio() {
		return municipio;
	}





	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_unidade == null) ? 0 : id_unidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instituicao other = (Instituicao) obj;
		if (id_unidade == null) {
			if (other.id_unidade != null)
				return false;
		} else if (!id_unidade.equals(other.id_unidade))
			return false;
		return true;
	}

	

}
