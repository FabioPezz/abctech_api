package br.com.cicdteste.data.application.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.cicdteste.data.application.OrderApplication;
import br.com.cicdteste.data.application.dto.AssistDto;
import br.com.cicdteste.data.application.dto.OrderDto;
import br.com.cicdteste.data.application.dto.OrderLocationDto;
import br.com.cicdteste.data.application.dto.OrderResponseDto;
import br.com.cicdteste.data.model.Assistance;
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
		order.setEndOrderLocation(getOrderLocationFromOrderLocationDTO(orderDto.getEnd()));
		
		this.orderService.saveOrder(order, orderDto.getAssists());
			}

	private OrderLocation getOrderLocationFromOrderLocationDTO(OrderLocationDto orderLocationDto) {
		OrderLocation orderLocation = new OrderLocation();
		orderLocation.setLatitude(orderLocationDto.getLatitude());
		orderLocation.setLongitude(orderLocationDto.getLongitude());
		orderLocation.setDate(orderLocationDto.getDateTime());
		return orderLocation;
	}
	
    @Override
    public List<OrderResponseDto> listOrderByOperatorId(Long operatorId){
        return orderService.listOrderbyOperator(operatorId).stream().map(
                (order) -> new OrderResponseDto(order.getId(), order.getOperatorId(), order.getAssists().stream().map(this::mapAssistToDto).collect(Collectors.toList()), mapOrderLocationToDto(order.getStartOrderLocation()), mapOrderLocationToDto(order.getEndOrderLocation()))
        ).collect(Collectors.toList());
    }
	
	private AssistDto mapAssistToDto(Assistance assist) {
		return new AssistDto(assist.getId(),assist.getName(),assist.getDescription());
	}
	
    private OrderLocationDto mapOrderLocationToDto(OrderLocation orderLocation){
        OrderLocationDto orderLocationDto = new OrderLocationDto();
        orderLocationDto.setLatitude(orderLocation.getLatitude());
        orderLocationDto.setLongitude(orderLocation.getLongitude());
        orderLocationDto.setDateTime(orderLocation.getDate());
        return orderLocationDto;
    }
}
