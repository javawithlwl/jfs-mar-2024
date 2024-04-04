package com.careerit.jfs.cj.basics.day10;

public class EmployeeManager {

    public static void main(String[] args) {

           Employee[] employees = getEmployees();
           showMaxSalaryEmployee(employees);


    }

    // Find the total salary of all employees

    public static double totalSalary(Employee[] employees){
        double sum = 0;
        for(Employee emp:employees) {
            sum += emp.getSalary();
        }
        return sum;
    }
    public static double minSalary(Employee[] employees){
        return 0;
    }
    public static double maxSalary(Employee[] employees){
        double max = employees[0].getSalary();
        for(Employee emp:employees) {
            if(emp.getSalary() > max) {
                max = emp.getSalary();
            }
        }
        return max;
    }

    public static void showMaxSalaryEmployee(Employee[] employees){
        double max = maxSalary(employees);
        System.out.println("Employees with max ("+max+") salary are :");
        for(Employee emp:employees) {
            if(emp.getSalary() == max) {
                System.out.println(emp.getEmpno() +" " +emp.getName()+" "+emp.getSalary());
            }
        }
    }

    public static void showMinSalaryEmployee(Employee[] employees){

    }


    private static Employee[] getEmployees(){
        Employee emp1 = new Employee(1001, "Krish", 45000);
        Employee emp2 = new Employee(1002, "Manoj", 95000);
        Employee emp3 = new Employee(1003, "John", 65000);
        Employee emp4 = new Employee(1004, "Smith", 75000);
        Employee emp5 = new Employee(1005, "David", 85000);
        Employee emp6 = new Employee(1006, "Chris", 55000);
        Employee emp7 = new Employee(1007, "Tom", 95000);
        Employee emp8 = new Employee(1008, "Jerry", 25000);
        Employee emp9 = new Employee(1009, "Tim", 15000);
        Employee emp10 = new Employee(1010, "Sam", 50000);
        return new Employee[]{emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10};
    }
}
