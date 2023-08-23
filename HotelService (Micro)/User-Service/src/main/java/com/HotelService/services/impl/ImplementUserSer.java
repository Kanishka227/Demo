package com.HotelService.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelService.entities.User;
import com.HotelService.exceptions.ResourceNotFound;
import com.HotelService.repositories.UserRepo;
import com.HotelService.services.UserService;

@Service
public class ImplementUserSer implements UserService{
	
	@Autowired
	UserRepo userRepo;

	@Override
	public User saveUser(User u) {
		String string = UUID.randomUUID().toString();
		u.setId(string);
		User savedUser = userRepo.save(u);
		return savedUser;
	}

	@Override
	public List<User> getAllUser() {
		List<User> allUsers = userRepo.findAll();
		return allUsers;
	}

	@Override
	public User getUserById(String userId) {
		Optional<User> findById = userRepo.findById(userId);
		return findById.orElseThrow(() -> new ResourceNotFound("Cannot find userId" + userId));
	}

	@Override
	public void deleteUser(String userId) {
		userRepo.deleteById(userId);
		
	}

	@Override
	public User updateUser(User user,String id) {
		User u = this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFound());;
		
		u.setEmail(user.getEmail());
		u.setPassword(user.getPassword());
		
		User savedUser = userRepo.save(u);
		
		return savedUser;
	}

}
