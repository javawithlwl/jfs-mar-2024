package com.careerit.jfs.cj.basics.day9;

public class AppUserManager {

    public static void main(String[] args) {

        AppUser user1 = new AppUser("Krish", "T", "krish.t@gmail.com", "9888888888");
        AppUser user2 = new AppUser("Manoj", "pvn", "manoj.pvn@gmail.com", "9876543210");
        System.out.println(user1.fullName());
        System.out.println(user2.fullName());

        user1.showUserDetails();
        System.out.println("--------------------");
        user2.showUserDetails();
    }
}
