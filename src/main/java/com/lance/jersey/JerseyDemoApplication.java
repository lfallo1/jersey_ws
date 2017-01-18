package com.lance.jersey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class JerseyDemoApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(JerseyDemoApplication.class, args);
	}
	
	// Used when deploying to a standalone servlet container, i.e. tomcat
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JerseyDemoApplication.class);
	}
}
