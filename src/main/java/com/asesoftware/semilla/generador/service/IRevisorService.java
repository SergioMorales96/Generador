package com.asesoftware.semilla.generador.service;

import com.asesoftware.semilla.generador.dto.ResponseDTO;

public interface IRevisorService {
	
	public ResponseDTO getAll();
	
	public ResponseDTO getID(String doc, String tipoDoc);
	
	public ResponseDTO getID(String doc);

}
