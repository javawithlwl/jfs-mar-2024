package com.careerit.jfs.cj.basics.day12;

class Student {
    private String name;
    private String email;
    private String phone;
    private String qualification;

    public Student(String name, String email, String qualification) {
        this(name, email, "N/A", qualification);
    }

    public Student(String name, String email, String phone, String qualification) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.qualification = qualification;
    }

    public void showInfo() {
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Phone :" + phone);
        System.out.println("Qualification :" + qualification);
    }

}

public class StudentManager {

    public static void main(String[] args) {

        Student s1 = new Student("Krish", "krish.t@gmail.com", "BE");
        Student s2 = new Student("Manoj", "manoj.pvn@gmail.com", "9876543210", "BE");
        s1.showInfo();
        s2.showInfo();

    }

}
