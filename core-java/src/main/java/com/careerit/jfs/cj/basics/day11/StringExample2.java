package com.careerit.jfs.cj.basics.day11;

public class StringExample2 {

    public static void main(String[] args) {

            String name = "Krish";
            int age = 26;
            double salary = 45000.50909;
            String city = "Hyderabad";


            String data = String.format("Name : %s, Age : %d, Salary : %.2f, City : %s", name,age,salary,city);
            System.out.println(data);

            String sql = """
                    select empno,ename,salary from emp
                    where salary > %d and city = '%s'
                    """;
            String query = String.format(sql, 40000, "Hyderabad");
            System.out.println(query);

    }
}
