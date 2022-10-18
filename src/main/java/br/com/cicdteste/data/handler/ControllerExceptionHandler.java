package br.com.cicdteste.data.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.cicdteste.data.handler.exception.MaxAssistsException;
import br.com.cicdteste.data.handler.exception.MinimunAssistRequiredException;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(MinimunAssistRequiredException.class)
	public ResponseEntity<ErrorMessageResponse> errorMinAssistRequired(MinimunAssistRequiredException exception){
		
		ErrorMessageResponse error = new ErrorMessageResponse();
		error.setMessage(exception.getMessage());
		error.setDescription(exception.getDescription());
		error.setTimestamp(new Date());
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		
		return new ResponseEntity<ErrorMessageResponse>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MaxAssistsException.class)
	public ResponseEntity<ErrorMessageResponse> errorMaxAssistsException(MaxAssistsException exception){
		
		ErrorMessageResponse error = new ErrorMessageResponse();
		error.setMessage(exception.getMessage());
		error.setDescription(exception.getDescription());
		error.setTimestamp(new Date());
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		
		return new ResponseEntity<ErrorMessageResponse>(error, HttpStatus.BAD_REQUEST);
	}
}
