package com.careerit.jfs.cj.basics.staticandfinal;

class Employee{
    private int empno;
    private String ename;
    private double salary;
    private static int count;
    private static final String COMPANY_NAME = "CareerIT";

    public Employee(int empno,String ename, double salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        count++;
    }

    public void show() {
        System.out.println("Empno :"+empno);
        System.out.println("Ename :"+ename);
        System.out.println("Salary :"+salary);
        System.out.println("Company :"+COMPANY_NAME);
    }
    public static void showCount() {
        System.out.println("Total employees :"+count);
    }
}
public class StaticExample {

    public static void main(String[] args) {

            Employee.showCount();
            Employee emp1 = new Employee(1001,"Krish",45000);
            Employee emp2 = new Employee(1002,"Manoj",55000);
            Employee emp3 = new Employee(1003,"Charan",65000);
            Employee emp4 = new Employee(1004,"Rajesh",75000);
            Employee emp5 = new Employee(1005,"Ramesh",85000);

            emp1.show();
            emp2.show();
            emp3.show();
            emp4.show();
            emp5.show();
            Employee.showCount();
    }
}
