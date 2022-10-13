package br.com.cicdteste.data.application.dto;

import java.util.Date;

import lombok.Data;

@Data
public class OrderLocationDto {

	private Double latitude;
	private Double longitude;
	private Date dateTime;
}
