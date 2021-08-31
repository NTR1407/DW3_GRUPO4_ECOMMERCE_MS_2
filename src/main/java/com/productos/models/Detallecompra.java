package com.productos.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "detalle_compra", schema = "e-commerce")


public class Detallecompra {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="iddetallecompra")
    private int iddetallecompra;
    private int idproducto;
    private int idcompra;
    private String producto_nombre;
    private String producto_precio;
    private String producto_cantidad;

    public Detallecompra(){}

    public Detallecompra(int iddetallecompra, int idproducto, int idcompra, String producto_nombre, String producto_precio, String producto_cantidad) {
        this.iddetallecompra = iddetallecompra;
        this.idproducto = idproducto;
        this.idcompra = idcompra;
        this.producto_nombre = producto_nombre;
        this.producto_precio = producto_precio;
        this.producto_cantidad = producto_cantidad;
    }

    public int getIddetallecompra() {
        return iddetallecompra;
    }

    public void setIddetallecompra(int iddetallecompra) {
        this.iddetallecompra = iddetallecompra;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public String getProducto_nombre() {
        return producto_nombre;
    }

    public void setProducto_nombre(String producto_nombre) {
        this.producto_nombre = producto_nombre;
    }

    public String getProducto_precio() {
        return producto_precio;
    }

    public void setProducto_precio(String producto_precio) {
        this.producto_precio = producto_precio;
    }

    public String getProducto_cantidad() {
        return producto_cantidad;
    }

    public void setProducto_cantidad(String producto_cantidad) {
        this.producto_cantidad = producto_cantidad;
    }
}
