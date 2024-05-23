package com.careerit.sc.basics.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContactManager {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("contact-bean.xml");
    ContactService contactService = context.getBean(ContactService.class);
    System.out.println(contactService.getContactCount());
  }
}
