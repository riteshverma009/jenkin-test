package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTest1Application {

	@GetMapping("/test")
	public String getMesage() {
		return "dil hai ki manta nhi";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerTest1Application.class, args);
	}

}
