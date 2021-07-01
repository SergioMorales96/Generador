package com.asesoftware.semilla.generador.exception;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.asesoftware.semilla.generador.dto.ErrorDTO;
import com.asesoftware.semilla.generador.dto.ResponseDTO;

@Order(2)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler(Exception.class)
	@ResponseBody
	protected ResponseEntity<Object> handlerException(Exception exception, WebRequest request){
		
		ErrorDTO dto = new ErrorDTO(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), exception);
		
		ResponseDTO responseDTO = new ResponseDTO(dto, false, "ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
		
		return buildhandlerException(responseDTO);
		
	}
	
	private ResponseEntity<Object> buildhandlerException(ResponseDTO dto){
		
		return new ResponseEntity<>(dto, dto.getStatus());
	}

}
