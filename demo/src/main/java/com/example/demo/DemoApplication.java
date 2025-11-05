package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hola web");
	}

	@RequestMapping("/")
	public String home(){
		System.out.println("bienvenido a mi web");
		return "bienvenido a mi web";
	}

	@RequestMapping("/hola")
	public String hola(){
		System.out.println("bienvenido a hola");
		return "bienvenido a hola";
	}

	@RequestMapping("/adios")
	public String adios(){
		System.out.println("bienvenido a adios");
		return "bienvenido a adios";
	}

		@RequestMapping("/html")
	public String html(){
		String html="<html><body><h1>Hola HTML</h1><p>Este es un ejemplo de respuesta HTML</p></body></html>";
		return html;
	}

}
