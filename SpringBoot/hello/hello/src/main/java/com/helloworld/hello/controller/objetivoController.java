package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivo")
public class objetivoController {

	@GetMapping
	public String objetivo () {
		return "Aprender mais sobre Spring Boot";
	}
}
