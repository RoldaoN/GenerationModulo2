package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class bsmComtroler {

	@GetMapping
	public String bsm (){
		return "Percistencia e atenção aos detalhes";
	}
}
