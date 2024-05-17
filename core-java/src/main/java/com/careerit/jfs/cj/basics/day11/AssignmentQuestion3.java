package com.careerit.jfs.cj.basics.day11;

public class AssignmentQuestion3 {

    public static void main(String[] args) {

            String name = "SM";
            String dname = "SALES";
            double salary = 2500;

           String sql = """
                   select
                      e.name, d.dname, e.salary
                      from emp e
                      inner join dept d on e.deptno = d.deptno
                      where e.name like '%s' and d.dname = '%s' and e.salary > %.2f                  
                   """;

    }
}
