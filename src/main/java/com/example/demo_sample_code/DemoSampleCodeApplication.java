package com.example.demo_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo_sample_code")
public class DemoSampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSampleCodeApplication.class, args);
	}

}
