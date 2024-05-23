package com.careerit.sc.basics.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContactManager {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    ContactService contactService = context.getBean(ContactService.class);
    System.out.println(contactService.getContactCount());
  }
}
