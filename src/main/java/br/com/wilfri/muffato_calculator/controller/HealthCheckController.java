package br.com.wilfri.muffato_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@GetMapping("health")
	public String alert() {
		return "UP";
	}

}