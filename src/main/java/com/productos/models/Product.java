package com.productos.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

@Table(name = "producto", schema = "e-commerce")

public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idproducto")
    private int idproducto;
    private String nombreproducto;
    private String marcaproducto;
    private int precioproducto;
    private String categoriaproducto;
    private int cantidadproducto;
    private String urlimageproducto;



    public Product() {
       this.idproducto = idproducto;
        this.nombreproducto= nombreproducto;
        this.marcaproducto = marcaproducto;
        this.precioproducto = precioproducto;
        this.categoriaproducto = categoriaproducto;
        this.cantidadproducto = cantidadproducto;
        this.urlimageproducto = urlimageproducto;

    }

    public String getCategoriaproducto() {
        return categoriaproducto;
    }

    public void setCategoriaproducto(String categoriaproducto) {
        this.categoriaproducto = categoriaproducto;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getMarcaproducto() {
        return marcaproducto;
    }

    public void setMarcaproducto(String marcaproducto) {
        this.marcaproducto = marcaproducto;
    }

    public int getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(int precioproducto) {
        this.precioproducto = precioproducto;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public String getUrlimageproducto() {
        return urlimageproducto;
    }

    public void setUrlimageproducto(String urlimagenproducto) {
        this.urlimageproducto = urlimageproducto;
    }

}
