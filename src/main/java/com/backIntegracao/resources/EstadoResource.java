package com.backIntegracao.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backIntegracao.domain.Estado;
import com.backIntegracao.domain.Municipio;
import com.backIntegracao.dto.EstadoDTO;
import com.backIntegracao.dto.MunicipioDTO;
import com.backIntegracao.services.EstadoService;
import com.backIntegracao.services.MunicipioService;

@RestController
@RequestMapping(value="/estados")
public class EstadoResource {
	
	@Autowired
	public EstadoService service;
	
	@Autowired
	public MunicipioService municipioService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EstadoDTO>> findAll() {
		List<Estado> list = service.findAll();
		List<EstadoDTO> listDto = list.stream().map(obj -> new EstadoDTO(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{estadoId}/cidades", method=RequestMethod.GET)
	public ResponseEntity<List<MunicipioDTO>> findMunicipios(@PathVariable String estadoId) {
		List<Municipio> list = municipioService.findByEstado(estadoId);  
		List<MunicipioDTO> listDto = list.stream().map(obj -> new MunicipioDTO(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok().body(listDto);
	}

}
