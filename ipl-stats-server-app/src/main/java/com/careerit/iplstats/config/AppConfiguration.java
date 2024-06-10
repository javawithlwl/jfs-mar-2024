package com.careerit.iplstats.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfiguration {

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*") // Add your allowed origins
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Add your allowed HTTP methods
            .allowedHeaders("*") // Allow all headers
            .maxAge(3600); // Set the max age for preflight requests
      }
    };
  }
}
