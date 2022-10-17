package br.com.cicdteste.data.service;

import java.util.List;

import br.com.cicdteste.data.model.Order;

public interface OrderService {

	void saveOrder(Order order, List<Long> arrayAssists)throws Exception;
	List<Order> listOrderbyOperator(Long operatorId);
}
