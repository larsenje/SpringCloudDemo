package com.optum.example.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class UserApplication {

	@Value("${foo}")
	String foo;

	@Value("${server.port}")
	String port;

	@RequestMapping()
	public String home(){
		return "User with value foo " + foo +" on port " + port;
	}
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
