package br.com.cicdteste.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cicdteste.data.model.Assistance;

public interface AssistanceRepository extends JpaRepository<Assistance,Long>{

}
