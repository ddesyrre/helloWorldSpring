package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloworldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping ("bsm")
	public String bsmGenBrasil() {
		return "BSM's da Generation Brasil \n"
				+ "\n Orientação ao futuro"
				+ "\n Responsabilidade pessoal"
				+ "\n Persistência"
				+ "\n Mentalidade de crescimento"
				+ "\n Proatividade"
				+ "\n Comunicação"
				+ "\n Orientação ao detalhe";
	}
	
	@GetMapping ("objetivos")
	public String ObjetivosSemana() {
		return "Objetivos semanais de aprendizado \n"
				+ "\n Aprender a criar um projeto Spring"
				+ "\n Melhorar minhas habilidades em Java"
				+ "\n Aprender mais sobre as funções de um gestor em tecnologia";
	}
}