package com.nology.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {

	@GetMapping("/hello")
	public String getGreeting(){
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
