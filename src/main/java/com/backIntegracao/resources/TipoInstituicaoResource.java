package com.backIntegracao.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backIntegracao.domain.TipoInstituicao;
import com.backIntegracao.dto.TipoInstituicaoDTO;
import com.backIntegracao.services.TipoInstituicaoService;

@RestController
@RequestMapping(value="/tipoInstituicao")
public class TipoInstituicaoResource {
	
	@Autowired
	public TipoInstituicaoService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<TipoInstituicaoDTO>> findAll() {
		List<TipoInstituicao> list = service.findAll();
		List<TipoInstituicaoDTO> listDto = list.stream().map(obj -> new TipoInstituicaoDTO(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok().body(listDto);
	}

}
