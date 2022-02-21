package com.ekart.users.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ekart.users.dtos.Response;
import com.ekart.users.dtos.UserDto;

@RestController
public class UserController {
        
	@PostMapping(consumes = "application/json")
	ResponseEntity<Response> registerUser(@RequestBody UserDto userDto) {
		return new ResponseEntity<>(null);
	}
	
	@GetMapping(consumes = "application/json")
	ResponseEntity<Response> loginUser(@RequestBody UserDto userDto) {
		return new ResponseEntity<>(null);
	}
	
	@PutMapping(consumes = "application/json")
	ResponseEntity<Response> updateAccountInfo(@RequestBody UserDto userDto) {
		return new ResponseEntity<Response>(null);
	}
	
}
