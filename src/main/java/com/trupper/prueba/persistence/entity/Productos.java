package com.trupper.prueba.persistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name =  "productos")
@Table
public class Productos {
    
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idProducto;

    @Column
    private String  clave;

    @Column
    private String descripcion;

    @Column
    private  Boolean activo ;
    
    @OneToMany(mappedBy = "idProducto" )
    private  List<ListaCompraDetalle> listasCompras; 

}
