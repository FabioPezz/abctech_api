package br.com.cicdteste.data.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.cicdteste.data.application.OrderApplication;
import br.com.cicdteste.data.application.dto.OrderDto;
import br.com.cicdteste.data.application.dto.OrderLocationDto;
import br.com.cicdteste.data.model.Order;
import br.com.cicdteste.data.model.OrderLocation;
import br.com.cicdteste.data.service.OrderService;

@Component
public class OrderApplicationImpl implements OrderApplication {

	private OrderService orderService;
	
	public OrderApplicationImpl(@Autowired OrderService orderService) {
		this.orderService = orderService;	
	}
		
	@Override
	public void createOrder(OrderDto orderDto) throws Exception{
		
		Order order = new Order();
		order.setOperatorId(orderDto.getOperatorId());
		order.setStartOrderLocation(getOrderLocationFromOrderLocationDTO(orderDto.getStart()));
		order.setEndOrderAlocation(getOrderLocationFromOrderLocationDTO(orderDto.getEnd()));
		
		this.orderService.saveOrder(order, orderDto.getAssists());
			}

	private OrderLocation getOrderLocationFromOrderLocationDTO(OrderLocationDto orderLocationDto) {
		OrderLocation orderLocation = new OrderLocation();
		orderLocation.setLatitude(orderLocationDto.getLatitude());
		orderLocation.setLongitude(orderLocationDto.getLongitude());
		orderLocation.setDate(orderLocationDto.getDateTime());
		return orderLocation;
	}
}
