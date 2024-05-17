package com.careerit.jfs.cj.basics.reflection;

import java.util.Properties;

public class ReadingProperties {

    public static void main(String[] args) {

        Properties properties = readProperties();
        System.out.println(properties.getProperty("name"));


    }

    public static Properties readProperties() {
        Properties properties = new Properties();
        try {
            properties.load(ReadingProperties.class.getResourceAsStream("/user.properties"));
        }catch(Exception e) {
            e.printStackTrace();
        }
        return  properties;
    }
}
