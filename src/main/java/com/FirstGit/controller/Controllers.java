package com.FirstGit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

	@GetMapping("/home")
	public String home() {
		return "Daniel";
	}
	@GetMapping("/name")
	public String name() {
		return "Daniel name";
	}
}
