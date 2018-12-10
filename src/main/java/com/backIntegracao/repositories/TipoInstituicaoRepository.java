package com.backIntegracao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backIntegracao.domain.TipoInstituicao;

@Repository
public interface TipoInstituicaoRepository extends JpaRepository<TipoInstituicao, String> {

	@Transactional(readOnly=true)
	@Query("SELECT obj FROM TipoInstituicao obj ORDER BY obj.ds_tipo_unidade")
	public List<TipoInstituicao> findAllTipoInstituicoes();
	
}
