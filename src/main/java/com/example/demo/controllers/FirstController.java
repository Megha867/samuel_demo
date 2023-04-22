package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/form")
public class FirstController {
	
	
	@GetMapping("/save")
	public Login saveForm() {
//		System.out.println("email="+login.getEmail());
		
		Login l = new Login();
		l.setEmail("megha");
		l.setPassword("meghaq");
		return l;
	}
}
