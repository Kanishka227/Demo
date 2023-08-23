package com.HotelService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HotelService.entities.User;

public interface UserRepo extends JpaRepository<User,String> {
	

}
