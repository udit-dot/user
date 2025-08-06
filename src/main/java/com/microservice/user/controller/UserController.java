package com.microservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.user.dto.UserDto;
import com.microservice.user.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public UserDto getUserDto() {
		return userService.getUserDetails();
	}

	@GetMapping("/getUser/{id}")
	public UserDto getUserDtoById(@PathVariable Integer id) {
		return userService.getUserDetailsById(id);
	}

}
