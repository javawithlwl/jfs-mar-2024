package com.careerit.bookstore.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("BookStore API Documentation")
                        .version("1.0")
                        .description("Spring Boot BOOKSTORE API Documentation")
                        .termsOfService("http://careerit.com/terms/")
                        .contact(new io.swagger.v3.oas.models.info.Contact()
                                .name("Careerit")
                                .url("http://careerit.com")
                                .email("admin@careerit.com"))
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")));
    }
}