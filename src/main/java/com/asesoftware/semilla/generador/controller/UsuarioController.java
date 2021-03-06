package com.asesoftware.semilla.generador.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.generador.dto.ResponseDTO;
import com.asesoftware.semilla.generador.dto.UsuarioDTO;
import com.asesoftware.semilla.generador.service.IUsuarioService;

@RestController
@RequestMapping(path = "/api/v1/usuario")
public class UsuarioController {

	private static final Logger logger  = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private IUsuarioService usuarioService;

	// listar todos

	@GetMapping(path = "/all")
	public ResponseDTO getAll() {

		return usuarioService.getAll();

	}

	// listar uno

	@GetMapping(path = "/{id}")
	public ResponseDTO getUsusarioById(@PathVariable Integer id) {

		return usuarioService.getUsuarioById(id);
	}

	@GetMapping(path = "/usuario")
	public ResponseDTO getUsusarioParametroById(@RequestParam Integer id) {

		return usuarioService.getUsuarioById(id);
	}

	// crear

	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO createUser(@RequestBody UsuarioDTO entity) {

		return usuarioService.createUser(entity);
	}

	// editar

	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO editarUser(@RequestBody UsuarioDTO entity) {

		return usuarioService.updateUser(entity);
	}

	// eliminar

	@GetMapping(path = "/delete/{id}")
	public ResponseDTO eliminarUsuario(@PathVariable Integer id) {

		logger.info("ingreso al metodo eliminarUsuario ");

		logger.info("usuario a eliminar {}",id);

		return usuarioService.deleteUser(id);
	}


}
