package br.com.cicdteste.data.handler.exception;

public class NotFindAssistException extends RuntimeException{
	private String description;
	
	public NotFindAssistException(String message, String description) {
		
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

