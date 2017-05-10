package com.hqq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootSampleTomcatJspApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootSampleTomcatJspApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleTomcatJspApplication.class, args);
	}
}
