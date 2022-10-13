package br.com.cicdteste.data.application;

import br.com.cicdteste.data.application.dto.OrderDto;

public interface OrderApplication {
	
	public void createOrder(OrderDto orderDto);
}
