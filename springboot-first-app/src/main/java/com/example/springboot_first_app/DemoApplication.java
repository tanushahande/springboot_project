package com.example.springboot_first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication {
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello, World! welcome to our DemoApplication";
	    }
}
