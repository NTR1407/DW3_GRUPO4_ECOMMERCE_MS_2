package com.productos.controllers;

import com.productos.models.Carrito;
import com.productos.repositories.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@RestController
public class CarritoController implements Serializable{

    private final CarritoRepository carritoRepository;

    public CarritoController(CarritoRepository carritoRepository){
        this.carritoRepository= carritoRepository;

    }

    @GetMapping("/carrito/all")
    public ResponseEntity<List<Carrito>> listaCarritos(){

        List<Carrito> ListaCarritos = carritoRepository.findAll();
        return new ResponseEntity<List<Carrito>>(ListaCarritos, HttpStatus.OK);
    }

    @GetMapping("/carrito/byuser/{id}")
    public ResponseEntity<List<Carrito>> carritofindById(@PathVariable(value = "id", required = true) int bId){

        List<Carrito> ListaCarrito2 = carritoRepository.carritofindById(bId);
        return new ResponseEntity<List<Carrito>>(ListaCarrito2, HttpStatus.OK);
    }
    @PostMapping("/addcarrito")

    Carrito newCarrito(@RequestBody Carrito carrito){

        return carritoRepository.save(carrito);
    }

}
