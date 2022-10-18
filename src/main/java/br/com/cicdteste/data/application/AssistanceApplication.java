package br.com.cicdteste.data.application;

import java.util.List;

import br.com.cicdteste.data.application.dto.AssistDto;
import lombok.Data;


public interface AssistanceApplication {

	public List<AssistDto> getAssists();

}
