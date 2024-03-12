package com.trupper.prueba.dto;

import java.util.List;

import lombok.Data;

@Data
public class CommonComprasDto {

    
    private String lista;
    private List<CompraDetalleDTO>  productos;
    public CommonComprasDto(String lista, List<CompraDetalleDTO> productos) {
        this.lista = lista;
        this.productos = productos;
    }


    
}

