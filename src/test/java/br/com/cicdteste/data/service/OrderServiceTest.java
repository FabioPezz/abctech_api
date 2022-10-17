package br.com.cicdteste.data.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mock.*;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.cicdteste.data.model.Assistance;
import br.com.cicdteste.data.model.Order;
import br.com.cicdteste.data.repository.AssistanceRepository;
import br.com.cicdteste.data.repository.OrderRepository;
import br.com.cicdteste.data.service.impl.OrderServiceImpl;

@SpringBootTest
public class OrderServiceTest {
	
	@Mock
	private OrderRepository orderRepository;
	@Mock
	private AssistanceRepository assistanceRepository;
	
	private OrderService orderService;
	
	@BeforeEach
	public void init() {
		orderService = new OrderServiceImpl(orderRepository, assistanceRepository);
		when(assistanceRepository.findById(any())).thenReturn(Optional.of(new Assistance(1L,"Teste ", "description")));
	}
	
	@Test
	public void order_service_not_null() {
		
		Assertions.assertNotNull(orderService);
		
	}
	
	@Test
	public void create_order_error_minimun() {
		Order newOrder = new Order();
		newOrder.setOperatorId(1234L);
		Assertions.assertThrows(Exception.class,() -> orderService.saveOrder(newOrder, List.of()));
		verify(orderRepository, times(0)).save(newOrder);
	}
	
	@Test
	public void create_order_error_maximun() {
		Order newOrder = new Order();
		newOrder.setOperatorId(1234L);
		Assertions.assertThrows(Exception.class,() -> orderService.saveOrder(newOrder, generated_mocks_ids(20) ));
		verify(orderRepository, times(0)).save(newOrder);
	}
	
	@Test
	public void create_order_sucess() {
		
	}
	
//Criando Mock de lista 
	private List<Long> generated_mocks_ids(int number){
		ArrayList<Long> arrayList = new ArrayList<>();
		for (int x = 0; x < number; x++) {
			arrayList.add(Integer.toUnsignedLong(x));
		}
		return arrayList; 
	}
}
