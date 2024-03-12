package com.trupper.prueba.service;

import com.trupper.prueba.dto.CommonComprasDto;
import com.trupper.prueba.dto.ApiResponse;

public interface ITrupperUserService {
    
    ApiResponse  addListWithProducts (  Integer idCliente,CommonComprasDto addComprasClienteDTO);
    
    ApiResponse  getListasByCliente( Integer idCliente );

    ApiResponse updateListProducts( Integer idCliente , CommonComprasDto addComprasClienteDTO) ;  

    ApiResponse deleteList( Integer  listaComprasId ) ;  
    
}
