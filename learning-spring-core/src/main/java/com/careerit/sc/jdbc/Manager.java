package com.careerit.sc.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.jdbc")
public class Manager {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    PlayerStatsDao playerStatsDao = context.getBean(PlayerStatsDao.class);
    System.out.println(playerStatsDao.getCount());
  }
}
