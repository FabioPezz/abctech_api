package br.com.cicdteste.data.application;
import br.com.cicdteste.data.application.dto.OrderDto;
import br.com.cicdteste.data.application.dto.OrderResponseDto;

import java.util.List;

public interface OrderApplication {
	
    void createOrder(OrderDto orderDto) throws Exception;

    List<OrderResponseDto> listOrderByOperatorId(Long operatorId);
    
}
