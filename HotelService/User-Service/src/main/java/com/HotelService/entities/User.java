package com.HotelService.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users_Detail")
@Getter
@Setter
public class User {
	
	@Id
	@Column(name= "Id")
	private String id;
	@Column(name= "Email")
	private String email;
	@Column(name= "Password")
	private String password;
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
	
}
