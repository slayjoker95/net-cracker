package com.nc.ncproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class NcprojectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NcprojectApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NcprojectApplication.class);
	}
}
