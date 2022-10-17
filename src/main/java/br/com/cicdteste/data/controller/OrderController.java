package br.com.cicdteste.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cicdteste.data.application.OrderApplication;
import br.com.cicdteste.data.application.dto.OrderDto;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	private OrderApplication orderApplication;
	
	public OrderController( @Autowired OrderApplication orderApplication) {
		
		this.orderApplication = orderApplication;
	}
	
	@PostMapping
	public ResponseEntity createOrder(@RequestBody OrderDto orderDto) throws Exception {
		
		orderApplication.createOrder(orderDto);
		return ResponseEntity.ok().build();
	}
}
