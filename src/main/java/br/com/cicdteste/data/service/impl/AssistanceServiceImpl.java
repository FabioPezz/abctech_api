package br.com.cicdteste.data.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cicdteste.data.model.Assistance;
import br.com.cicdteste.data.repository.AssistanceRepository;
import br.com.cicdteste.data.service.AssistanceService;

@Service
public class AssistanceServiceImpl implements AssistanceService{

	private final AssistanceRepository repository;
	
	public AssistanceServiceImpl(AssistanceRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Assistance> getAssistanceList() {
		return repository.findAll();
	}
	


}
