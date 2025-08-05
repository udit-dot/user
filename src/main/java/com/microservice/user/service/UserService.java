package com.microservice.user.service;

import org.springframework.stereotype.Service;

import com.microservice.user.dto.UserDto;

@Service
public class UserService {

	public UserDto getUserDetails() {
		
		return new UserDto(1, "Udit");
	}
}
