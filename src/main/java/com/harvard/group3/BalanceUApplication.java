package com.harvard.group3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
@EnableAutoConfiguration
public class BalanceUApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BalanceUApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BalanceUApplication.class, args);
	}
}
