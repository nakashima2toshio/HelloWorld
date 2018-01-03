package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldApplication {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "home Hello World responsebody";
    }
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
