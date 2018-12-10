package com.backIntegracao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="td_tipo_unidade", catalog ="dfdwp")
public class TipoInstituicao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id_tipo_unidade;
	private String ds_tipo_unidade;
	
	public TipoInstituicao() {}
	
	public TipoInstituicao(Integer id_tipo_unidade, String ds_tipo_unidade) {
		super();
		this.id_tipo_unidade = id_tipo_unidade;
		this.ds_tipo_unidade = ds_tipo_unidade;
	}

	@OneToMany(mappedBy="tipoInstituicao")
	@JsonIgnore
	private List<Instituicao> instituicoes = new ArrayList<>();

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

	public List<Instituicao> getInstituicoes() {
		return instituicoes;
	}

	public void setInstituicoes(List<Instituicao> instituicoes) {
		this.instituicoes = instituicoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_tipo_unidade == null) ? 0 : id_tipo_unidade.hashCode());
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
		TipoInstituicao other = (TipoInstituicao) obj;
		if (id_tipo_unidade == null) {
			if (other.id_tipo_unidade != null)
				return false;
		} else if (!id_tipo_unidade.equals(other.id_tipo_unidade))
			return false;
		return true;
	}

	
	
	

}
