package com.HotelService.exceptions;

public class ResourceNotFound extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ResourceNotFound(String s){
		super(s);
	}
	ResourceNotFound(){
		super("Resource Not Found !");
	}

}
