package com.careerit.jfs.cj.basics.enumex;

public class EmployeeManager {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1001, "Krish", 45000);
        Employee emp2 = new Employee(1002, "Manoj", 55000);

        System.out.println(emp1);
        System.out.println(emp1.empno());
        System.out.println(emp1.name());
        System.out.println(emp1.salary());

    }
}
