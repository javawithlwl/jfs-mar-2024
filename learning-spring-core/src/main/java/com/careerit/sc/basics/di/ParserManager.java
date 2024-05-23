package com.careerit.sc.basics.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.basics.di")
public class ParserManager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(ParserManager.class);
    ParserService parserService = context.getBean(ParserService.class);
    parserService.readData("data.txt");

  }
}
