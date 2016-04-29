package com.optum.example.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AccountApplication {

    @Value("${foo}")
    String foo;

    @Value("${server.port}")
    String port;

    @RequestMapping()
    public String home(){
        return "Account with value foo " + foo +" on port " + port;
    }

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
}
