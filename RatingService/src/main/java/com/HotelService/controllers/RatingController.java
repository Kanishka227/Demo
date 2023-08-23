package com.HotelService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HotelService.entities.Rating;
import com.HotelService.services.RatingServiceImpl;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	RatingServiceImpl imp;
	
	//create rating
	
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating r) {
		return ResponseEntity.status(HttpStatus.CREATED).body(imp.create(r));
	}
	
	//get all rating
	
	@GetMapping
	public ResponseEntity<List<Rating>> getAll(){
		return ResponseEntity.ok(imp.getAllRating());
	}
	
	//get rating by user id 
	
	@GetMapping("/users/{id}")
	public ResponseEntity<List<Rating>> getUser(@PathVariable String id){
		return ResponseEntity.ok(imp.getByUserId(id));
	}
	
	//get rating by hotel id
	
	@GetMapping("/hotels/{id}")
	public ResponseEntity<List<Rating>> getHotel(@PathVariable String id){
		return ResponseEntity.ok(imp.getByHotelId(id));
	}
}
