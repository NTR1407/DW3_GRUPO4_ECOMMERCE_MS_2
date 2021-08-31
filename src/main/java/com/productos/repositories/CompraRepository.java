package com.productos.repositories;

import com.productos.models.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

@Repository
public interface CompraRepository extends JpaRepository <Compra, Integer> {


    @Query(value = " SELECT c FROM Compra c WHERE c.idusuario =:aId ")
    List<Compra> findById(int aId);


}
