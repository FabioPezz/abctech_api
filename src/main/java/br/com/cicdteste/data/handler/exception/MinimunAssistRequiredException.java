package br.com.cicdteste.data.handler.exception;

import lombok.Getter;


public class MinimunAssistRequiredException extends RuntimeException{
	private String description;
	
	public MinimunAssistRequiredException(String message, String description) {
		
		super(message);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}


