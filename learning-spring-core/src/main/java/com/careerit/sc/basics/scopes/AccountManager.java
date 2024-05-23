package com.careerit.sc.basics.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.basics.scopes")
public class AccountManager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(AccountManager.class);
    AccountService accountService = context.getBean(AccountService.class);
    System.out.println(accountService);
    AccountService accountService1 = context.getBean(AccountService.class);
    System.out.println(accountService1);
    AccountService accountService2 = context.getBean(AccountService.class);
    System.out.println(accountService2);


    ApplicationContext context1 = new AnnotationConfigApplicationContext(AccountManager.class);
    AccountService accountService3 = context1.getBean(AccountService.class);
    System.out.println(accountService3);
    AccountService accountService4 = context1.getBean(AccountService.class);
    System.out.println(accountService4);

  }
}
