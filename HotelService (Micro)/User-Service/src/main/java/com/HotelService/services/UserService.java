package com.HotelService.services;

import java.util.List;

import com.HotelService.entities.User;

public interface UserService {

	//create user
	
	User saveUser (User u);
	
	//get all users
	
	List<User> getAllUser();
	
	//get user by id
	
	User getUserById(String userId);
	
	//delete a user
	
	void deleteUser(String userId);
	
	//update a user
	
	User updateUser(User user,String id);
}
