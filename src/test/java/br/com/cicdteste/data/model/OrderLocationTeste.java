package br.com.cicdteste.data.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderLocationTeste {

	@DisplayName("OrdemLocation gravando sem data")
	@Test
	public void order_location_with_no_date() {
        OrderLocation orderLocation = new OrderLocation();
        orderLocation.setDate(null);
        Assertions.assertEquals(orderLocation.getDate(), null);
	}
	
	@DisplayName("OrdemLocation gravando a longitude")
	@Test
	public void order_location_with_longitute() {
        OrderLocation orderLocation = new OrderLocation();
        orderLocation.setLongitude(43.5);
        Assertions.assertEquals(orderLocation.getLongitude(), 43.5);
	}
}
