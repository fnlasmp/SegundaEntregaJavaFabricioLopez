package com.test.crud.cliente.crud.cliente.controller;
import java.lang.Exception;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.test.crud.cliente.crud.cliente.model.Persona;
import com.test.crud.cliente.crud.cliente.model.Producto;
import com.test.crud.cliente.crud.cliente.services.ProductoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/Producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @GetMapping("/all")
    public List<Producto> obtenerProductoById() {
    return this.productoService.obtenerProducto();

    }

    @PostMapping("/create")
    public ResponseEntity<?> agregarUnProducto(@RequestBody Producto producto) {
        
        try{
            this.productoService.agregarProducto(producto);
            return ResponseEntity.ok(producto);
            
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable int id) {
        
        try{
            this.productoService.eliminarProducto(id);
            return ResponseEntity.ok("Producto eliminada correctamente");
            
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
            return ResponseEntity.status(400).body("Producto no encontrada");
        }
    }

}