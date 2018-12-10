package com.backIntegracao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backIntegracao.domain.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, String>{
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Municipio obj Where obj.estado.id_uf = :estadoId ORDER BY obj.no_municipio")
	public List<Municipio> findMunicipioByEstado(@Param("estadoId") String estado_id);

}
