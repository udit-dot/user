package com.microservice.user.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.user.dto.UserDto;
import com.microservice.user.entity.User;
import com.microservice.user.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ModelMapper mapper;

	public UserDto getUserDetails() {

		return new UserDto(1, "Udit");
	}

	public UserDto getUserDetailsById(Integer id) {

		User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("U not found"));
		return mapper.map(user, UserDto.class);
	}
}
