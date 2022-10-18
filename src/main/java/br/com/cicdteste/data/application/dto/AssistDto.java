package br.com.cicdteste.data.application.dto;

import lombok.Data;

@Data
public class AssistDto {

	private Long id;
	private String name;
	private String description;
	
	public AssistDto(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
