package com.HotelService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.HotelService.entities.User;
import com.HotelService.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	//create a user
	
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User u) {
		User user = userService.saveUser(u);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	// get all user
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> allUser = this.userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
	
	//get single user by id
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable String id){
		User userById = this.userService.getUserById(id);
		return ResponseEntity.ok(userById);
	}
	
	//delete user
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		this.userService.deleteUser(id);
	}
	
	//update user
	
	@PutMapping("/{id}")
	public ResponseEntity<User> update(@RequestBody User u,@PathVariable String id ){
		User updateUser = this.userService.updateUser(u, id);
		return ResponseEntity.ok(updateUser);
	}

}
