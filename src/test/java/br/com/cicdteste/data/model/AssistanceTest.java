package br.com.cicdteste.data.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AssistanceTest {


	@DisplayName("Assistencia gravando Id")
	@Test
	public void assistance_with_id() {
        Assistance assistance = new Assistance();
		assistance.setId(5L);
        Assertions.assertEquals(assistance.getId(), 5L);
	}
	
	@DisplayName("Assistencia gravando nome")
	@Test
	public void assistance_with_name() {
        Assistance assistance = new Assistance();
		assistance.setName("nome");
        Assertions.assertEquals(assistance.getName(), "nome");
	}
	
	@DisplayName("Assistencia gravando descrição")
	@Test
	public void assistance_with_description() {
        Assistance assistance = new Assistance();
		assistance.setDescription("descricao");
        Assertions.assertEquals(assistance.getDescription(), "descricao");
	}
}
