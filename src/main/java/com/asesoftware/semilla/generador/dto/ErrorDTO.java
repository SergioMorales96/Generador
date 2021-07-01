package com.asesoftware.semilla.generador.dto;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class ErrorDTO {
	
	private HttpStatus status;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyy hh:mm:ss")
	private LocalDateTime timeStam;
	
	private String mensaje;
	
	private String debuggMensaje;
	
	private String origen;

	
	public ErrorDTO() {
		timeStam = LocalDateTime.now();
	}
	
	public ErrorDTO(HttpStatus status, String mensaje, Throwable ex) {
		super();
		this.status = status;
		this.mensaje = mensaje;
		this.debuggMensaje = ex.getLocalizedMessage();
	}

}
