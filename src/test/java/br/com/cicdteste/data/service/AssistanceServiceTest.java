package br.com.cicdteste.data.service;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.cicdteste.data.model.Assistance;
import br.com.cicdteste.data.repository.AssistanceRepository;
import br.com.cicdteste.data.service.impl.AssistanceServiceImpl;

@SpringBootTest
public class AssistanceServiceTest {

	@Mock
	private AssistanceRepository assistanceRepository;
	private AssistanceService assistanceService;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
			assistanceService = new AssistanceServiceImpl(assistanceRepository);
		
	}
	
	@DisplayName("Listando assistancias disponiveis: Sucesso")
	@Test
	public void list_sucess() {
		Assistance assistance1 = new Assistance();
        Assistance assistance3 = new Assistance();
        Assistance assistance2 = new Assistance();
        
        when(assistanceRepository.findAll()).thenReturn(List.of(assistance1, assistance2, assistance3));
        
        List<Assistance> values = assistanceService.getAssistanceList();

        Assertions.assertEquals(3, values.size());
        Assertions.assertSame(values.get(0), assistance1);
        Assertions.assertSame(values.get(1), assistance2);
	}
	
	@DisplayName("Listando assistencias indisponiveis :: Erro")
    @Test
    public void list_error(){
        when(assistanceRepository.findAll()).thenReturn(List.of());

        List<Assistance> values = assistanceService.getAssistanceList();
        Assertions.assertEquals(0, values.size());
    }
}
