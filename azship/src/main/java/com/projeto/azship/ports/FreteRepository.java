package com.projeto.azship.ports;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.azship.model.Frete;

public interface FreteRepository extends JpaRepository<Frete, Integer> {

}
