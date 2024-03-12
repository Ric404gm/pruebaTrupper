package com.trupper.prueba.persistence.entity;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
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
@Entity(name =  "listacompra")
@Table
public class ListaCompra {
    
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idListaCompra;

    
    @ManyToOne
    @JoinColumn(name = "idCliente",nullable = false)
    private  Clientes idCliente ;
    

    @Column
    private String nombre ;
    
    @Column
    private Date fechaRegistro ;
    
    @Column
    private Date  fechaUltimaActualizacion ;    
    
    @Column
    private  Boolean  activo;

    
    @OneToMany(mappedBy = "idListaCompra" )
    private  List<ListaCompraDetalle> listaCompraDetalles; 




}
