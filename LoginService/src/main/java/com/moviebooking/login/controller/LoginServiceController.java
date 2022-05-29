package com.moviebooking.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moviebooking.login.User;


@RestController
public class LoginServiceController {
	
	private List<User> usersList = new ArrayList<>();
	
	@Autowired
	private LoginServiceImpl loginService = new LoginServiceImpl();
	
	
	
	@GetMapping("/login/{userId}/{password}")
	public String userLogin(@PathVariable String userId, @PathVariable String password) {
		
		
		usersList = getUsersListFromDB();
		
		for (User userLs : usersList) {
			if(userLs.getUserName().equals(userId) && userLs.getPassword().equals(password))
				return "User Logged in";
		}	
			      
		return "Login not successful";
	}
	
	@RequestMapping(value="/login/theatre/{threatreId}", method=RequestMethod.POST)
	public String theatreLogin(@PathVariable String theatreId, String hallType) {
		
		if(hallType.equals("Cinema"))
		{
			loginService.registerCinemaHall();
		}
		else if(hallType.equals("PlayTheatre"))
		{
			loginService.registerCinemaHall();
		}
		
		return "Theatre logged in";
		
	}
	
	private List<User> getUsersListFromDB(){
		//logic to fetch users from DB, here they are hardcoded
		usersList.add(new User("Amit", "amit", "Password@123"));
		usersList.add(new User("Tanya", "tanya", "Password@123"));
		usersList.add(new User("Ruby", "ruby", "Password@123"));
		return usersList;
	}

}
