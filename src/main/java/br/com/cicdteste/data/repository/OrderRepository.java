package br.com.cicdteste.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cicdteste.data.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

}
