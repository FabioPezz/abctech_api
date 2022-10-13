package br.com.cicdteste.data.application.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderDto {
	
	private Long operatorId;
	private List<Long> assists;
	private OrderLocationDto start;
	private OrderLocationDto end;

}
