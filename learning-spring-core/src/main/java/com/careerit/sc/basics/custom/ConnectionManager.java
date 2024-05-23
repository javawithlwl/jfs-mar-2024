package com.careerit.sc.basics.custom;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.basics.custom")
public class ConnectionManager {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ConnectionManager.class);
    DbConnection dbConnection = context.getBean(DbConnection.class);
    dbConnection.connect();
    context.close();
  }
}
