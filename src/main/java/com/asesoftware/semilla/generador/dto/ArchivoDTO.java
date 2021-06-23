package com.asesoftware.semilla.generador.dto;

import java.sql.Time;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class ArchivoDTO {
	
	private Integer id;
	
	private String nombre;
	
	private Integer usuarioCreador;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "America/New_York")
	private Date fecha;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "America/New_York")
	private Time hora;
	
	private String nombreUsuario;
	
	public ArchivoDTO() {
		
	}
	

	public ArchivoDTO(Integer id, String nombre, Integer usuarioCreador, Date fecha, Time hora, String nombreUsuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuarioCreador = usuarioCreador;
		this.fecha = fecha;
		this.hora = hora;
		this.nombreUsuario = nombreUsuario;
	}



}
