package com.asesoftware.semilla.generador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.generador.dto.ResponseDTO;
import com.asesoftware.semilla.generador.service.IRevisorService;

@RestController
@RequestMapping(path = "/api/v1/revisor")
public class RevisorController {
	
	@Autowired
	private IRevisorService revisorService;
	
	@GetMapping(path = "/all")
	public ResponseDTO getAll() {
		return revisorService.getAll();
	}
	
	@GetMapping(path = "/documentoTipo/{doc}/{tipoDoc}")
	public ResponseDTO getByID(@PathVariable String doc, @PathVariable String tipoDoc) {
		return revisorService.getID(doc, tipoDoc);
	}
	
	@GetMapping(path = "/documento/{doc}")
	public ResponseDTO getByID(@PathVariable String doc) {
		return revisorService.getID(doc);
	}

}
