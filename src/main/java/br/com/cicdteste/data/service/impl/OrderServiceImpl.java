package br.com.cicdteste.data.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cicdteste.data.model.Assistance;
import br.com.cicdteste.data.model.Order;
import br.com.cicdteste.data.repository.AssistanceRepository;
import br.com.cicdteste.data.repository.OrderRepository;
import br.com.cicdteste.data.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	private OrderRepository orderRepository;
	private AssistanceRepository assistanceRepository;
	
	public OrderServiceImpl(
			@Autowired OrderRepository orderRepository,
			@Autowired AssistanceRepository assistanceRepository) {
		this.orderRepository = orderRepository;
		this.assistanceRepository = assistanceRepository;
	}
	
	@Override
	public void saveOrder(Order order, List<Long> arrayAssists) throws Exception {
		ArrayList<Assistance> assistances = new ArrayList<>();
		arrayAssists.forEach( i ->{
			Assistance assistance = assistanceRepository.findById(i).orElseThrow();
			assistances.add(assistance);
		});
		
		order.setAssists(assistances);
		 
		if(!order.hasMinAssists()) {
			throw new Exception();
		}
		else if(order.exceedsMaxAssists()) {
			throw new Exception();
		}
		
		orderRepository.save(order);
	}

	@Override
	public List<Order> listOrderbyOperator(Long operatorId) {
		return null;
	}

}
