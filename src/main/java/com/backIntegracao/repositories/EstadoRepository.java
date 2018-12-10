package com.backIntegracao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backIntegracao.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, String>{
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Estado obj ORDER BY obj.no_uf")
	public List<Estado> findAllEstados();

}
