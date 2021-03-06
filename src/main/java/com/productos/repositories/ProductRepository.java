package com.productos.repositories;


import com.productos.models.Product;
import com.productos.models.Detallecompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository  extends JpaRepository <Product, String>{

    @Query(value = " SELECT c FROM Product c WHERE c.categoriaproducto =:Cat ")
    List<Product> productofindByCat(String Cat);

}
