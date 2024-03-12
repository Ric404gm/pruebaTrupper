package com.trupper.prueba.persistence.entity;


import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name =  "clientes")
@Table
public class Clientes {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Integer  idCliente;

    @Column
    private  String nombre;

    
    @Column
    private  Boolean  activo;


    @OneToMany(mappedBy = "idCliente" )
    private  List<ListaCompra> listasCompras; 

}
