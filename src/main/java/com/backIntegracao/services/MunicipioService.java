package com.backIntegracao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backIntegracao.domain.Municipio;
import com.backIntegracao.repositories.MunicipioRepository;

@Service
public class MunicipioService {
	
	@Autowired
	private MunicipioRepository repo;
	
	public List<Municipio> findByEstado(String estadoId) {
		return repo.findMunicipioByEstado(estadoId);
	}

}
