package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CidadesController {
	
	@GetMapping("cidades/nova")
	public String novo() {
		return "cidade/CadastroCidade";
	}

}
