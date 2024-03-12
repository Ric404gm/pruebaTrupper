package com.trupper.prueba.dto;

import lombok.Data;

@Data
public class CompraDetalleDTO {
    private Integer idProducto;
    private Integer cantidad;
    public CompraDetalleDTO(Integer idProducto, Integer cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    } 

    
}
