package com.example.lp2_finalwork.Exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;



@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler  {

    
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<DefaultError> handleException(EntityNotFoundException e, HttpServletRequest request) {
		
		DefaultError erro = new DefaultError(HttpStatus.NOT_FOUND.value(), e.getMessage());
		return new ResponseEntity<DefaultError>(erro, HttpStatus.NOT_FOUND);
	}
}
