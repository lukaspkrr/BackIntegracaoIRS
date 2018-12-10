package com.backIntegracao.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backIntegracao.domain.Instituicao;
import com.backIntegracao.repositories.InstituicaoRepository;

@Service
public class InstituicaoService {
	
	@Autowired
	private InstituicaoRepository repo;
	
	public List<Instituicao> findInsts(String estado_id, String municipio_id, String bairro, String tipo_inst) {
		System.out.println(estado_id + " " + municipio_id + " " + bairro + " " + tipo_inst);
		if (tipo_inst.length() > 0) {
			System.out.println("tem tipoInst");
			if (bairro.length() > 0) {
				System.out.println("tem bairro");
				return repo.findInstituicaoByBairroAndTipInst(bairro, Integer.parseInt(tipo_inst));
			} else if (municipio_id.length() > 0) {
				System.out.println("tem municipio");
				return repo.findInstituicaoByMunicipioAndTipInst(municipio_id, Integer.parseInt(tipo_inst));
			} else if (estado_id.length() > 0) {
				System.out.println("tem estado");
				return repo.findInstituicaoByEstadoAndTipInst(estado_id, Integer.parseInt(tipo_inst));
			} else {
				return repo.findInstituicaoByTipInst(Integer.parseInt(tipo_inst));
			}
		} else {
			System.out.println("não tem tipoInst");
			if (bairro.length() > 0) {
				System.out.println("tem bairro");
				return repo.findInstituicaoByBairro(bairro);
			} else if (municipio_id.length() > 0) {
				System.out.println("tem municipio");
				return repo.findInstituicaoByMunicipio(municipio_id);
			} else if (estado_id.length() > 0) {
				System.out.println("tem estado");
				return repo.findInstituicaoByEstado(estado_id);
			}
		}
		return new ArrayList<Instituicao>();
	}

}
