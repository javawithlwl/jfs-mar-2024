package com.careerit.jfs.cj.basics.generics;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
    private Long empno;
    private String name;
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private Long rollno;
    private String name;

}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Account {
    private String accNumber;
    private String name;
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class StudentDto {
    private Long rollno;
    private String name;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class EmployeeDto {
    private Long empno;
    private String name;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class AccountDto {
    private String accNumber;
    private String name;
}

public class GenericExample3 {

    public static void main(String[] args) {

            Employee emp = new Employee(1001L,"Krish");
            Student student = new Student(1001L,"Krish");
            Account account = new Account("1001","Krish");

            EmployeeDto empDto = convert(emp,EmployeeDto.class);
            System.out.println(empDto);

            Employee emp1 = convert(empDto,Employee.class);
            System.out.println(emp1);

            List<String> list = List.of("Hello","Java","Python","C","C++");
            List<Integer> lenList = convert(list,String::length);
            System.out.println(lenList);

            List<Employee> empList = List.of(new Employee(1001L,"Krish"),new Employee(1002L,"Manoj"));
            List<EmployeeDto> empDtoList = convert(empList, e -> new EmployeeDto(e.getEmpno(),e.getName()));
            System.out.println(empDtoList);



    }

   /* public static StudentDto convert(Student student) {
        return new StudentDto(student.getRollno(),student.getName());
    }

    public static EmployeeDto convert(Employee emp) {
        return new EmployeeDto(emp.getEmpno(),emp.getName());
    }

    public static AccountDto convert(Account account) {
        return new AccountDto(account.getAccNumber(),account.getName());
    }

    public static Student convert(StudentDto student) {
        return new Student(student.getRollno(),student.getName());
    }

    public static Employee convert(EmployeeDto emp) {
        return new Employee(emp.getEmpno(),emp.getName());
    }

    public static Account convert(AccountDto account) {
        return new Account(account.getAccNumber(),account.getName());
    }
    */

    public static <T> T convert(Object obj,Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(obj, clazz);
    }

    public static <T,G> List<G> convert(List<T> list, Function<T,G> fun) {
        return list.stream().map(fun).toList();
    }

}
