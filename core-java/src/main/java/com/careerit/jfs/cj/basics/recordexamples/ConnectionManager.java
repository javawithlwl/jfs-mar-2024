package com.careerit.jfs.cj.basics.recordexamples;

record Connector(String url, String username, String password) {

    public static Connector getInstance(String url, String username, String password) {
        return new Connector(url, username, password);
    }
}

public class ConnectionManager {

    public static void main(String[] args) {
        Connector con1 = Connector.getInstance("jdbc:mysql://localhost:3306/jfsdb", "root", "root@123");
        System.out.println(con1.url());
        System.out.println(con1.username());
        System.out.println(con1.password());

    }
}
