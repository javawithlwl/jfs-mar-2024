package com.careerit.jfs.cj.basics.cf.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee  {


    private int empno;
    private String ename;
    private double salary;
}

class Sort implements Comparator<Employee>{
    // Sort by salary, if salary is same then sort by name and if name is same then sort by empno
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() > o2.getSalary()) {
            return 1;
        }else if(o1.getSalary() < o2.getSalary()) {
            return -1;
        }else {
            int nameCompare = o1.getEname().compareTo(o2.getEname());
            if(nameCompare == 0) {
                return o1.getEmpno() - o2.getEmpno();
            }
            return nameCompare;
        }
    }
}
public class SortingExample2 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1001, "Krish", 45000);
        Employee emp2 = new Employee(1002, "Krish", 45000);
        Employee emp3 = new Employee(1003, "Charan", 15000);
        Employee emp4 = new Employee(1004, "Suresh", 35000);
        Employee emp5 = new Employee(1005, "Ramesh", 5000);
        Employee emp6 = new Employee(1000, "Krish", 45000);


        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);

        Collections.sort(list,new Sort());
        System.out.println(list);
    }
}
