package com.careerit.cbook;


import com.careerit.cbook.dao.ContactDetailsDao;
import com.careerit.cbook.dao.ContactDetailsDaoImpl;
import com.careerit.cbook.dao.UserDetailsDao;
import com.careerit.cbook.dao.UserDetailsDaoImpl;
import com.careerit.cbook.domain.ContactDetails;
import com.careerit.cbook.domain.UserDetails;
import com.careerit.cbook.exception.BadCredentialsException;
import com.careerit.cbook.exception.UserAlreadyExistsException;
import com.careerit.cbook.service.ContactDetailsService;
import com.careerit.cbook.service.ContactDetailsServiceImpl;
import com.careerit.cbook.service.UserDetailsService;
import com.careerit.cbook.service.UserDetailsServiceImpl;
import com.careerit.cbook.util.LoginUserContextHolder;

import java.util.List;
import java.util.Scanner;

public class ContactBookManager {

  public static void main(String[] args) {

    UserDetailsDao userDetailsDao = new UserDetailsDaoImpl();
    UserDetailsService userDetailsService = new UserDetailsServiceImpl(userDetailsDao);
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("1. Register");
      System.out.println("2. Login");

      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          registerUser(userDetailsService);
          break;
        case 2:
          loginUser(userDetailsService);
          break;
        default:
          System.out.println("Invalid choice");
      }
    }


  }

  private static void registerUser(UserDetailsService userDetailsService) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter email:");
    String email = sc.nextLine();
    System.out.println("Enter mobile:");
    String mobile = sc.nextLine();
    System.out.println("Enter password:");
    String password = sc.nextLine();
    UserDetails userDetails = new UserDetails();
    userDetails.setEmail(email);
    userDetails.setMobile(mobile);
    userDetails.setPassword(password);
    try {
      UserDetails register = userDetailsService.register(userDetails);
      System.out.println("User registered successfully with id: " + register.getId());
    } catch (UserAlreadyExistsException e) {
      System.out.println(e.getMessage());
    }
  }

  private static void loginUser(UserDetailsService userDetailsService) {
    UserDetails loginUser = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter email or mobile:");
    String emailOrMobile = sc.nextLine();
    System.out.println("Enter password:");
    String password = sc.nextLine();
    try {
      loginUser = userDetailsService.login(emailOrMobile, password);
      LoginUserContextHolder.setLoginUser(loginUser);
      System.out.println("User logged in successfully with id: " + loginUser.getId());
      boolean flag = true;
      ContactDetailsDao contactDetailsDao = new ContactDetailsDaoImpl();
      ContactDetailsService contactDetailsService = new ContactDetailsServiceImpl(contactDetailsDao);
      while (flag) {
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. View all contacts");
        System.out.println("5. Search contact");
        System.out.println("6. Exit");
        int ch = sc.nextInt();
        switch (ch) {
          case 1:
            addContact(contactDetailsService);
            break;
          case 2:
            System.out.println("Update contact");
            break;
          case 3:
            System.out.println("Delete contact");
            break;
          case 4:
            List<ContactDetails> contactDetailsList = contactDetailsService.getAllContacts();
            showContacts(contactDetailsList);
            break;
          case 5:
            System.out.println("Search contact");
            break;
          case 6:
            loginUser = null;
            LoginUserContextHolder.setLoginUser(loginUser);
            flag = false;
            break;
          default:
            System.out.println("Invalid choice");
        }
      }
    } catch (BadCredentialsException e) {
      System.out.println(e.getMessage());
    }
  }

  private static void showContacts(List<ContactDetails> contactDetailsList) {
    if(contactDetailsList.isEmpty()){
      System.out.println("No contacts found");
      return;
    }
    for (ContactDetails contactDetails : contactDetailsList) {
      System.out.println(String.format("Id: %s, Name: %s, Email: %s, Mobile: %s", contactDetails.getId(), contactDetails.getName(), contactDetails.getEmail(), contactDetails.getMobile()));
    }
  }

  private static void addContact(ContactDetailsService contactDetailsService) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name:");
    String name = sc.nextLine();
    System.out.println("Enter email:");
    String email = sc.nextLine();
    System.out.println("Enter mobile:");
    String mobile = sc.nextLine();
    ContactDetails contactDetails = new ContactDetails();
    contactDetails.setName(name);
    contactDetails.setEmail(email);
    contactDetails.setMobile(mobile);
    ContactDetails addContact = contactDetailsService.addContact(contactDetails);
    System.out.println("Contact added successfully with id: " + addContact.getId());
  }
}
