package com.backIntegracao.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backIntegracao.domain.Instituicao;
import com.backIntegracao.dto.InstituicaoDTO;
import com.backIntegracao.services.InstituicaoService;

@RestController
@RequestMapping(value="/instituicoes")
public class InstituicaoResource {
	
	@Autowired
	private InstituicaoService service;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<InstituicaoDTO>> findInstituicao(
			@RequestParam(value="estado", defaultValue="") String estado_id, 
			@RequestParam(value="municipio", defaultValue="") String municipio_id, 
			@RequestParam(value="bairro", defaultValue="") String bairro, 
			@RequestParam(value="tipoInst", defaultValue="") String tipo_inst) {
		
		List<Instituicao> list = service.findInsts(estado_id, municipio_id, bairro, tipo_inst);
		List<InstituicaoDTO> listDto = list.stream().map(obj -> new InstituicaoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

}
