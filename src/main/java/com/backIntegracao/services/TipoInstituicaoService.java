package com.backIntegracao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backIntegracao.domain.TipoInstituicao;
import com.backIntegracao.repositories.TipoInstituicaoRepository;

@Service
public class TipoInstituicaoService {
	
	@Autowired
	private TipoInstituicaoRepository repo;

	public List<TipoInstituicao> findAll() {
		return repo.findAllTipoInstituicoes();
	}
	
}
