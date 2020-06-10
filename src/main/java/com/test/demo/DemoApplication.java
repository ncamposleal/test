package com.test.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan ({"com.test.demo"})
@EnableSwagger2
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Docket productApi() {
	   return new Docket(DocumentationType.SWAGGER_2).select()
		  .apis(RequestHandlerSelectors.basePackage("com.test.demo"))
		  .paths(PathSelectors.ant("/*"))
		  .build()
		  .apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
		  "REST API", 
		  "Test.", 
		  "API", 
		  "Terms of service", 
		  new Contact("Nicolas Campos", "www.example.com", "ncamposleal@gmail.com"), 
		  null, null, Collections.emptyList());
	}
}
