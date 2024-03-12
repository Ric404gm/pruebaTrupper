package com.trupper.prueba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trupper.prueba.dto.ApiResponse;
import com.trupper.prueba.dto.CommonComprasDto;
import com.trupper.prueba.service.ITrupperUserService;
import com.trupper.prueba.service.TrupperUserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api")
public class TrupperClientesApi {
    
    
    @Autowired
    private   ITrupperUserService iTrupperUserService;



    
    @PostMapping(value = "/lista/cliente/{idCliente}", consumes =  MediaType.APPLICATION_JSON_VALUE ,produces  = 
     MediaType.APPLICATION_JSON_VALUE  )
    @ResponseBody
    public ApiResponse addListByCliente(@PathVariable Integer idClienteId,@RequestBody CommonComprasDto commonComprasDto ) {
        return this.addListByCliente(idClienteId, commonComprasDto);
    }
    
    
    @PutMapping(value = "/lista/cliente/{idCliente}" , consumes =  MediaType.APPLICATION_JSON_VALUE ,produces  = 
     MediaType.APPLICATION_JSON_VALUE  )
    @ResponseBody
    public ApiResponse updateListByCliente(@PathVariable Integer idClienteId ,@RequestBody CommonComprasDto commonComprasDto) {
         return this.iTrupperUserService.updateListProducts(idClienteId, commonComprasDto);
    }
    
    @GetMapping(value = "/lista/cliente/{idCliente}",produces  =  MediaType.APPLICATION_JSON_VALUE  )
    @ResponseBody
    public ApiResponse getListByCliente(   @PathVariable Integer idClienteId   ) {
        return  this.iTrupperUserService.deleteList(idClienteId)   ;
    }

    @DeleteMapping(value = "/lista/elimina/{idLista}" ,produces  =  MediaType.APPLICATION_JSON_VALUE  )
    @ResponseBody
    public ApiResponse  deleteList(@PathVariable Integer idLista ) {
        return this.iTrupperUserService.deleteList(idLista) ;
    }

}
