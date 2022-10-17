package br.com.cicdteste.data.application.dto;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class OrderDto {
	
	private Long operatorId;
	private List<Long> assists;
	private OrderLocationDto start;
	private OrderLocationDto end;
	public Long getOperatorId() {
		return operatorId;
	}
	public List<Long> getAssists() {
		return assists;
	}
	public OrderLocationDto getStart() {
		return start;
	}
	public OrderLocationDto getEnd() {
		return end;
	}
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	public void setAssists(List<Long> assists) {
		this.assists = assists;
	}
	public void setStart(OrderLocationDto start) {
		this.start = start;
	}
	public void setEnd(OrderLocationDto end) {
		this.end = end;
	}

}
