package com.test.crud.cliente.crud.cliente.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.crud.cliente.crud.cliente.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}