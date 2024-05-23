package com.careerit.sc.basics.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DataBaseUtil dataBaseUtil(){
        return new DataBaseUtil();
    }
    @Bean
    public ContactDao contactDao(){
        return new ContactDaoImpl(dataBaseUtil());
    }

    @Bean
    public ContactService contactService(){
        return new ContactServiceImpl(contactDao());
    }

}
