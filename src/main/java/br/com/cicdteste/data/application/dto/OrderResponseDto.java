package br.com.cicdteste.data.application.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class OrderResponseDto {

	public Long id;
	private Long operatorId;
	private List<AssistDto> assists;
	private OrderLocationDto start;
	private OrderLocationDto end;
	
	public OrderResponseDto(Long id, Long operatorId, List<AssistDto> assists, OrderLocationDto start,
			OrderLocationDto end) {
		super();
		this.id = id;
		this.operatorId = operatorId;
		this.assists = assists;
		this.start = start;
		this.end = end;
	}
	
	
}
