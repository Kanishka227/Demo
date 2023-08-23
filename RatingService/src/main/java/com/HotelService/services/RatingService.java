package com.HotelService.services;

import java.util.List;

import com.HotelService.entities.Rating;

public interface RatingService {

	//create rating
	
	public Rating create(Rating r);
	
	//get all ratings
	
	public List<Rating> getAllRating();
	
	//get all by userId
	
	public List<Rating> getByUserId(String id);
	
	//get all by hotelId
	
	public List<Rating> getByHotelId(String id);
}
