package com.asesoftware.semilla.generador.service;

import com.asesoftware.semilla.generador.dto.ArchivoDTO;
import com.asesoftware.semilla.generador.dto.ResponseDTO;

public interface IArchivoService {
	
	public ResponseDTO getAll();
	public ResponseDTO createArchivo(ArchivoDTO archivoDTO);
	public ResponseDTO buscarPorId(Integer id);
	public ResponseDTO consultarTodosCreador(Integer usuarioCreador);
	public ResponseDTO consultarTodosNombres(String nombreUsuario);

}
