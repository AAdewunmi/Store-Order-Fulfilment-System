package com.storeorderfulfilmentapplication.orderfulfilment;

public class OrderNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1776967235463359773L;
	
	OrderNotFoundException(Long id){
		super("Could not find order " + id);
	}

}
