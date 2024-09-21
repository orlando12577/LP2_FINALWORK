package com.example.lp2_finalwork.Exceptions;



public class DefaultError {
   
    private Integer code;
	private String message;
	
	
	
	public DefaultError(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

    
}
