package com.trupper.prueba.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trupper.prueba.persistence.entity.ListaCompraDetalle;
import com.trupper.prueba.persistence.entity.ListaCompraDetallePK;

@Repository
public interface ListaCompraDetalleRepository extends JpaRepository<ListaCompraDetalle,ListaCompraDetallePK>{
    
}
