package com.HotelService.exceptions;

public class ResourceNotFound extends RuntimeException{
	
	public ResourceNotFound(){
		super("ResourceNotFound");
	}
	public ResourceNotFound(String message){
		super(message);
	}

}
