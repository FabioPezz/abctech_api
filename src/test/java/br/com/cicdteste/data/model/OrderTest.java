package br.com.cicdteste.data.model;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderTest {

	@DisplayName("Ordem gravando Id")
	@Test
	public void order_with_id() {
        Order order = new Order();
        order.setId(1L);
        Assertions.assertEquals(order.getId(), 1L);
	}
	
	@DisplayName("Ordem gravando Id do Operador")
	@Test
	public void order_with_operatorId() {
        Order order = new Order();
        order.setOperatorId(90L);
        Assertions.assertEquals(order.getOperatorId(), 90);
	}
	
	@DisplayName("Ordem sem Assistencia")
	@Test
	public void order_with_no_assistance() {
        Order order = new Order();
        Assistance assistance = new Assistance();
        List<Assistance> assistences = null;
        order.setAssists(assistences);
        Assertions.assertEquals(order.getAssists(),null);
	}
	
}
