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
@Table(name="tb_uf", catalog ="dbgeral")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id_uf;
	private String uf_sigla;
	private String no_uf;
	
	@OneToMany(mappedBy="estado")
	@JsonIgnore
	private List<Municipio> Municipios = new ArrayList<>();

	public Estado() {}
	
	public Estado(String id_uf, String uf_sigla, String no_uf) {
		super();
		this.id_uf = id_uf;
		this.uf_sigla = uf_sigla;
		this.no_uf = no_uf;
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

	public List<Municipio> getMunicipios() {
		return Municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		Municipios = municipios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_uf == null) ? 0 : id_uf.hashCode());
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
		Estado other = (Estado) obj;
		if (id_uf == null) {
			if (other.id_uf != null)
				return false;
		} else if (!id_uf.equals(other.id_uf))
			return false;
		return true;
	}
	
	

}
