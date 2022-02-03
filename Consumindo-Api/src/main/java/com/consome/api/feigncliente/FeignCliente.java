package com.consome.api.feigncliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.consome.api.cliente.DadosResponse;

@FeignClient(value = "fraseDoDia", url = "https://api.adviceslip.com")
public interface FeignCliente {

	@GetMapping(path = "/advice", consumes = "application/json")
	public String frase();
}