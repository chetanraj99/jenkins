package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JController {

	@GetMapping("/wish")
	public String wish() {
		return "Good morning everyone";
	}
}
