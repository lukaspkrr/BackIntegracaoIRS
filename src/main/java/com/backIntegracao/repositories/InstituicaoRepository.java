package com.backIntegracao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.backIntegracao.domain.Instituicao;

public interface InstituicaoRepository extends JpaRepository<Instituicao, String> {
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Instituicao obj WHERE obj.municipio.estado.id_uf = :estadoId ORDER BY obj.no_fantasia")
	public List<Instituicao> findInstituicaoByEstado(@Param("estadoId") String estado_id);
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Instituicao obj WHERE obj.municipio.id_municipio = :municipioId ORDER BY obj.no_fantasia")
	public List<Instituicao> findInstituicaoByMunicipio(@Param("municipioId") String municipio_id);
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Instituicao obj WHERE obj.no_bairro = :bairro ORDER BY obj.no_fantasia")
	public List<Instituicao> findInstituicaoByBairro(@Param("bairro") String bairro);
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Instituicao obj WHERE obj.tipoInstituicao.id_tipo_unidade = :tip ORDER BY obj.no_fantasia")
	public List<Instituicao> findInstituicaoByTipInst(@Param("tip") Integer tipo_inst);
	
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Instituicao obj WHERE obj.municipio.estado.id_uf = :estadoId AND obj.tipoInstituicao.id_tipo_unidade = :tip ORDER BY obj.no_fantasia")
	public List<Instituicao> findInstituicaoByEstadoAndTipInst(@Param("estadoId") String estado_id, @Param("tip") Integer tipo_inst);

	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Instituicao obj WHERE obj.municipio.id_municipio = :municipioId AND obj.tipoInstituicao.id_tipo_unidade = :tip ORDER BY obj.no_fantasia")
	public List<Instituicao> findInstituicaoByMunicipioAndTipInst(@Param("municipioId") String municipio_id, @Param("tip") Integer tipo_inst);

	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Instituicao obj WHERE obj.no_bairro = :bairro AND obj.tipoInstituicao.id_tipo_unidade = :tip ORDER BY obj.no_fantasia")
	public List<Instituicao> findInstituicaoByBairroAndTipInst(@Param("bairro") String bairro, @Param("tip") Integer tipo_inst);
}
