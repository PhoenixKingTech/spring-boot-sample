package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/ping")
	public String getResponse() {
		System.out.println("Making some changes");
		return "pong";
	}
}
