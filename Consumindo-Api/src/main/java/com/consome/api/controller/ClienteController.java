package com.consome.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consome.api.feigncliente.FeignCliente;

@RestController
public class ClienteController {
	
	@Autowired
	FeignCliente feignCliente;

	@GetMapping()
	public ResponseEntity<String> teste() {		
		
		
		return ResponseEntity.ok(feignCliente.frase());
				
	}
}
