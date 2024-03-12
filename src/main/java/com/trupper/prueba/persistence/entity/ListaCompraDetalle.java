package com.trupper.prueba.persistence.entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name =  "listacompradetalle")
@Table
public class ListaCompraDetalle {
    
    
    /* 
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idListaCompraDetalle;
    */
       
    @EmbeddedId
    private ListaCompraDetallePK compraDetallePK;

    
    @ManyToOne
    @JoinColumn(name = "idProducto",nullable = false)
    private Productos  idProducto;

    @Column
    private Integer cantidad;

    
     
    @ManyToOne
    @JoinColumn(name = "idListaCompra",nullable = false)
    private  ListaCompra idListaCompra ;
}
