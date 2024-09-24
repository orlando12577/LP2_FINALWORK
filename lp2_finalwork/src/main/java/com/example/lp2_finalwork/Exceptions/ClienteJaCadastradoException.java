package com.example.lp2_finalwork.Exceptions;



public class ClienteJaCadastradoException extends RuntimeException {
    private static final long serialVersionUID = 5696746720435250792L;
	
	public ClienteJaCadastradoException(String msg){
        super(msg);
    }
    
}
