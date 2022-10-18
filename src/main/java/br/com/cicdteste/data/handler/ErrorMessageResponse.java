package br.com.cicdteste.data.handler;

import java.util.Date;

import lombok.Data;

@Data
public class ErrorMessageResponse {
	
	private Integer statusCode;
	private Date timestamp;
	private String message;
	private String description;
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date date) {
		this.timestamp = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
