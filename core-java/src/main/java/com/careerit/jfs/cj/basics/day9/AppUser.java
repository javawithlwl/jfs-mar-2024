package com.careerit.jfs.cj.basics.day9;

public class AppUser {
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;

    public AppUser(String firstName, String lastName, String email, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
    }

    public String fullName(){
        return firstName + " " + lastName;
    }
    public void showUserDetails(){
       String details = fullName() + ", " + email + ", " + mobile;
       System.out.println(details);
    }



}
