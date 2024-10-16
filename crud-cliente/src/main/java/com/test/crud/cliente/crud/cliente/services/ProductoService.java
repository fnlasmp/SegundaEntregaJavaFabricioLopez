package com.test.crud.cliente.crud.cliente.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.test.crud.cliente.crud.cliente.model.Producto;
import com.test.crud.cliente.crud.cliente.repository.ProductoRepository;


@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;

    public Producto obteneProductoById(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    public List<Producto> obtenerProducto() {
        return productoRepository.findAll();
    }

    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public void eliminarProducto(int id) {
        productoRepository.deleteById(id);
    }

}