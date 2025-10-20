package com.trex.test_hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
@Slf4j
public class TestHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestHelloApplication.class, args);
	}

	@GetMapping("/name/{name}")
	public String helloGet(@PathVariable String name){
		String text = "Hello " + name;
		System.out.println(text);
		return text;
	}

	@PostMapping("/name")
	public String helloPost(@RequestBody String name){
		String text = "Hello " + name + "This is a POST request";
		System.out.println(text);
		return text;
	}

}

