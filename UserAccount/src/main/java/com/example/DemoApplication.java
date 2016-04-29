package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class DemoApplication {


	@Autowired
	private AccountService accountService;

	@Autowired
	private UserService userService;

	@RequestMapping
	public ResponseEntity<?> getUserAndAccount(){

		Map<String, String> map = new HashMap<>();
		map.put("account", accountService.getAccount());
		map.put("user", userService.getUser());

		return ResponseEntity.ok(map);

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
