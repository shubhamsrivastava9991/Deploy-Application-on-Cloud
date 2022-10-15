package com.project.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
	
	@RestController
	public class AwsController {
		
		@GetMapping("/aws")
		public String home() {
			return "Successfully deployed the Springboot Applicaation to the Aws Cloud";
	}
}
