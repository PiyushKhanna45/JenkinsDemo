package com.amdocs.restDemoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping
	@RequestMapping("api/v1/add")
	public double addition(double first, double second) {
		return first+second;
	}
	
	@GetMapping
	@RequestMapping("api/v1/subtract")
	public double subtract(double first, double second) {
		return first-second;
	}
	
}
