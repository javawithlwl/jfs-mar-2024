package com.careerit.sc.basics.custom;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DbConnection {

    @PostConstruct
    public void init() {
        System.out.println("DbConnection object created");
    }

    public void connect(){
        System.out.println("Connected to database");
    }

    @PreDestroy
    public void close(){
        System.out.println("Connection closed");
    }
}
