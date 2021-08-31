package com.productos.controllers;

import com.productos.models.Compra;
import com.productos.models.Detallecompra;
import com.productos.repositories.CompraRepository;
import com.productos.repositories.DetallecompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.persistence.*;
import java.util.*;

@RestController
public class DetallecompraController {

    private final DetallecompraRepository detallecompraRepository;

    public DetallecompraController(DetallecompraRepository detallecompraRepository){
        this.detallecompraRepository = detallecompraRepository;

    }

    @GetMapping("/compras/detallecompra/{id}")
    public ResponseEntity<List<Detallecompra>> detallefindById(@PathVariable(value = "id", required = true) int cId){

        List<Detallecompra> ListaDetalles2 = detallecompraRepository.detallefindById(cId);
        return new ResponseEntity<List<Detallecompra>>(ListaDetalles2, HttpStatus.OK);
    }


}
