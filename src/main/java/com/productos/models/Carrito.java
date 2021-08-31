package com.productos.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity

@Table(name = "carrito", schema = "e-commerce")
public class Carrito implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idcarrito")
    private int idcarrito;
    private int idproducto;
    private int idusuario;

    public Carrito(){}

    public Carrito(int idproducto, int idusuario) {
        //this.idcarrito = idcarrito;
        this.idproducto = idproducto;
        this.idusuario = idusuario;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdcarrito() {
        return idcarrito;
    }
}
