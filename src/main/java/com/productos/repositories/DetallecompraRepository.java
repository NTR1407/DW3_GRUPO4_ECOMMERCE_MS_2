package com.productos.repositories;

import com.productos.models.Compra;
import com.productos.models.Detallecompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface DetallecompraRepository extends JpaRepository <Detallecompra, Integer> {

    @Query(value = " SELECT c FROM Detallecompra c WHERE c.idcompra =:cId ")
    List<Detallecompra> detallefindById(int cId);
}
