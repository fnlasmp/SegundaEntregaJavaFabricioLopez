package com.test.crud.cliente.crud.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.crud.cliente.crud.cliente.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {

}