package com.trupper.prueba.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trupper.prueba.persistence.entity.Productos;

@Repository
public interface ProductosRepository extends JpaRepository <Productos,Integer>{
    
}
