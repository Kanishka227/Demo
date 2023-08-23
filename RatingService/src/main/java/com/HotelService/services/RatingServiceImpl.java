package com.HotelService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelService.entities.Rating;
import com.HotelService.repositories.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	RatingRepository repository;
	
	@Override
	public Rating create(Rating r) {
		
		return this.repository.save(r);
	}

	@Override
	public List<Rating> getAllRating() {
		List<Rating> findAll = this.repository.findAll();
		return findAll;
	}

	@Override
	public List<Rating> getByUserId(String id) {
		return this.repository.findByuserId(id);
	}

	@Override
	public List<Rating> getByHotelId(String id) {
		return this.repository.findByhotelId(id);
	}

}
