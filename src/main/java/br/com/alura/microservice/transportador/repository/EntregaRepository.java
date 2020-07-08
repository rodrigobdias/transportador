package br.com.alura.microservice.transportador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.microservice.transportador.model.Entrega;


public interface EntregaRepository extends JpaRepository<Entrega, Long>{
	
}
