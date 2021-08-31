package com.productos.controllers;

import com.productos.models.Compra;
import com.productos.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.persistence.*;
import java.util.*;

@RestController
public class CompraController {

    private final CompraRepository compraRepository;

    public CompraController(CompraRepository compraRepository){
        this.compraRepository = compraRepository;

    }

    @GetMapping("/compras/all")
    public ResponseEntity<List<Compra>> listaCompras(){

        List<Compra> ListaCompras = compraRepository.findAll();
        return new ResponseEntity<List<Compra>>(ListaCompras, HttpStatus.OK);
    }

    @GetMapping("/compras/byuser/{id}")
    public ResponseEntity<List<Compra>> findById(@PathVariable(value = "id", required = true) int aId){

        List<Compra> ListaCompras2 = compraRepository.findById(aId);
        return new ResponseEntity<List<Compra>>(ListaCompras2, HttpStatus.OK);
    }



}
