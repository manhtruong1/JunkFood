package com.shop.junkfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableSpringDataWebSupport
public class JunkFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunkFoodApplication.class, args);
	}

}
