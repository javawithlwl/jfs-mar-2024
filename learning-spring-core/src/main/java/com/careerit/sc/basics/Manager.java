package com.careerit.sc.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("greetings-bean.xml");
    Greetings greetings = context.getBean(Greetings.class);
    System.out.println(greetings.getMessage());

  }
}
