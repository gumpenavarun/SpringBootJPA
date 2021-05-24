package com.example.curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.curd.dao"}) 
public class CurdByH2DbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdByH2DbApplication.class, args);
	}

}
