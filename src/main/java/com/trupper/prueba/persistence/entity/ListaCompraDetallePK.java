package com.trupper.prueba.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ListaCompraDetallePK  implements Serializable{
    
    private  Integer idListaDetalleCompra ;
    private  Integer idProductoCodigo ;
    public ListaCompraDetallePK(Integer idListaDetalleCompra, Integer idProductoCodigo) {
        this.idListaDetalleCompra = idListaDetalleCompra;
        this.idProductoCodigo = idProductoCodigo;
    }
       

    

    
}
