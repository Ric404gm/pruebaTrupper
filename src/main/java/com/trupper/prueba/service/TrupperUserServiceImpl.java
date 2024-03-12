package com.trupper.prueba.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trupper.prueba.dto.ApiResponse;
import com.trupper.prueba.dto.CommonComprasDto;
import com.trupper.prueba.persistence.entity.Clientes;
import com.trupper.prueba.persistence.entity.ListaCompra;
import com.trupper.prueba.persistence.entity.ListaCompraDetalle;
import com.trupper.prueba.persistence.entity.ListaCompraDetallePK;
import com.trupper.prueba.persistence.entity.Productos;
import com.trupper.prueba.persistence.repository.ClientesRepository;
import com.trupper.prueba.persistence.repository.ListaCompraRepository;

@Service
public class TrupperUserServiceImpl  implements ITrupperUserService {
    

    @Autowired
    private  ClientesRepository clientesRepository;


    @Autowired
    private ListaCompraRepository  listaCompraRepository;


    
    private  Clientes  getValidCliente( Integer  idCliente){

        Optional<Clientes> clienteoptional   = clientesRepository.findById(idCliente);
        return   clienteoptional.isPresent() ?  clienteoptional.get() : null ;
    }



    @Override
    public ApiResponse addListWithProducts(Integer idCliente, CommonComprasDto addComprasClienteDTO) {
    
        var  clientes = getValidCliente(idCliente);
        if( clientes!= null){
            
            var compra = new ListaCompra();
            compra.setActivo(true);
            compra.setFechaRegistro( new Date() );
            compra.setFechaUltimaActualizacion(  new Date());
            compra.setIdCliente( clientes);
            compra.setNombre(addComprasClienteDTO.getLista());
            
            List<ListaCompraDetalle> detallesCompra = new  ArrayList<>(); 

             
            addComprasClienteDTO.getProductos().stream().forEach(  (item) ->
              {

                


                ListaCompraDetalle compraDetalle = new ListaCompraDetalle();
                
                compraDetalle.setCompraDetallePK( new ListaCompraDetallePK(idCliente, idCliente));/// 
                Productos productos = new Productos();

               // detallesCompra.add(  );

              });


            return new  ApiResponse<CommonComprasDto>().buildResponse(addComprasClienteDTO,true) ;
        }else{
            return new ApiResponse<>().buildResponse(null, false);
        }
        
    }
    @Override
    public ApiResponse getListasByCliente(Integer idCliente) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public ApiResponse updateListProducts(Integer idCliente, CommonComprasDto addComprasClienteDTO) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public ApiResponse deleteList(Integer listaComprasId) {
        // TODO Auto-generated method stub
        return null;
    }
}
