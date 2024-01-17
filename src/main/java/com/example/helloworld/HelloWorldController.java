package com.example.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @CrossOrigin(origins = "*") // Allow requests from all origins
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World! 123";

}
}
