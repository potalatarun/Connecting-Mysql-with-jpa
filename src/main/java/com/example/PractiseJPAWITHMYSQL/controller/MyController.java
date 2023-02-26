package com.example.PractiseJPAWITHMYSQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.PractiseJPAWITHMYSQL.repository.UserRepository;

@Controller
public class MyController {
	@Autowired
	UserRepository userRepository;
	
	@PostMapping(value="/add")
	public @ResponseBody String adddb(@RequestParam String name, @RequestParam String email){
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "saved";
	}
	@GetMapping(value="/all")
	public @ResponseBody Iterable<com.example.PractiseJPAWITHMYSQL.entitymodel.User> getAllUsers(){
		return userRepository.findAll();
	}
}
