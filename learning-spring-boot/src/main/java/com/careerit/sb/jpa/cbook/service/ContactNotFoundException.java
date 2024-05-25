package com.careerit.sb.jpa.cbook.service;

public class ContactNotFoundException extends RuntimeException{

    public ContactNotFoundException(String message){
        super(message);
    }
}
