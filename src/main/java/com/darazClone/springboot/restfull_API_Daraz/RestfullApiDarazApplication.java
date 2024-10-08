package com.darazClone.springboot.restfull_API_Daraz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestfullApiDarazApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullApiDarazApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedMethods("*")
				.allowedOrigins("https://omtamang.github.io/Daraz-Clone");
			}
		};
	}

}
