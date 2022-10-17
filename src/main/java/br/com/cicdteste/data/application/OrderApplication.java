package br.com.cicdteste.data.application;
import br.com.cicdteste.data.application.dto.OrderDto;


import java.util.List;

public interface OrderApplication {
	
    void createOrder(OrderDto orderDto) throws Exception;

    
}
