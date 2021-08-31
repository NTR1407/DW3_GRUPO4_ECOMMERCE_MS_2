package com.productos.repositories;

import com.productos.models.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;


@Repository
public interface CarritoRepository extends JpaRepository <Carrito, Integer> {

    @Query(value = " SELECT c FROM Carrito c WHERE c.idusuario =:bId ")
    List<Carrito> carritofindById(int bId);

}
