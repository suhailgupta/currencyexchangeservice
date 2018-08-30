package com.suhail.microservices.currencyexchangeservice.currencyexchangeservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExchangeNotFoundException extends RuntimeException{

	public ExchangeNotFoundException(String message) {
		super(message);
	}
	
}
