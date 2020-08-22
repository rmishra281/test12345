package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.domain.User;
import com.user.dto.UserRequest;
import com.user.service.UserService;

@RestController
public class UserRegConroller {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/regsiter" , method = {RequestMethod.POST})
	
	public User registerUser(@RequestBody UserRequest userRequest){
		return userService.registerUser(userRequest);
	}
	

	@RequestMapping(value = "/user/{id}" , method = {RequestMethod.GET})
	
	public Object getUserById(@PathVariable(value = "id") Long id ){
		
		return userService.getUserByUserId(id);
		
		
	}
	
	

}
