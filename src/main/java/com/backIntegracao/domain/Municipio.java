package com.backIntegracao.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_municipio", catalog ="dbgeral")
public class Municipio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id_municipio;
	private String no_municipio;
	
	@ManyToOne
	@JoinColumn(name="id_uf")
	private Estado estado;

	public Municipio() {}
	
	public Municipio(String id_municipio, String no_municipio, Estado estado) {
		super();
		this.id_municipio = id_municipio;
		this.no_municipio = no_municipio;
		this.estado = estado;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_municipio == null) ? 0 : id_municipio.hashCode());
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
		Municipio other = (Municipio) obj;
		if (id_municipio == null) {
			if (other.id_municipio != null)
				return false;
		} else if (!id_municipio.equals(other.id_municipio))
			return false;
		return true;
	}
	
	
	
	

}
