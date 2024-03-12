package com.trupper.prueba.dto;

import lombok.Data;

@Data
public class ApiResponse <C> {

    public static final String RESPONSE_OK = "0";
    public static final String RESPONSE_ERROR = "1";
    
    private C  content;
    private  String status;

    public ApiResponse() {
    }

    
    public ApiResponse buildResponse(C  content , boolean  isOK) {
        this.content = content;
        this.status =  isOK  ?  RESPONSE_OK : RESPONSE_ERROR  ;
        return this;
    }

    
}
