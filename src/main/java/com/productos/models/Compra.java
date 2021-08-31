package com.productos.models;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity

@Table(name = "compra", schema = "e-commerce")
public class Compra {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idcompra")
    private int idcompra;
    @Temporal(TemporalType.DATE)
    private Date fechacompra;
    private int idusuario;
    private String pais_envio;
    private String departamento_envio;
    private String direccion_ennvio;
    private String telefono_envio;
    private int totalapagar;
    //@OneToMany(mappedBy="compra")
   // List<Compra_detalle> compraList;
    public Compra(){}

    public Compra(Date fechacompra, int idusuario, String pais_envio, String departamento_envio, String direccion_ennvio, String telefono_envio, int totalapagar) {
        this.fechacompra = fechacompra;
        this.idusuario = idusuario;
        this.pais_envio = pais_envio;
        this.departamento_envio = departamento_envio;
        this.direccion_ennvio = direccion_ennvio;
        this.telefono_envio = telefono_envio;
        this.totalapagar = totalapagar;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getPais_envio() {
        return pais_envio;
    }

    public void setPais_envio(String pais_envio) {
        this.pais_envio = pais_envio;
    }

    public String getDepartamento_envio() {
        return departamento_envio;
    }

    public void setDepartamento_envio(String departamento_envio) {
        this.departamento_envio = departamento_envio;
    }

    public String getDireccion_ennvio() {
        return direccion_ennvio;
    }

    public void setDireccion_ennvio(String direccion_ennvio) {
        this.direccion_ennvio = direccion_ennvio;
    }

    public String getTelefono_envio() {
        return telefono_envio;
    }

    public void setTelefono_envio(String telefono_envio) {
        this.telefono_envio = telefono_envio;
    }

    public int getTotalapagar() {
        return totalapagar;
    }

    public void setTotalapagar(int totalapagar) {
        this.totalapagar = totalapagar;
    }
}
