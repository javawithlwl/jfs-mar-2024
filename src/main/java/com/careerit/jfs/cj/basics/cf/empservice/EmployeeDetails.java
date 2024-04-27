package com.careerit.jfs.cj.basics.cf.empservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDetails {
    private long id;
    private String fullName;
    private String gender;
    private double salary;
    private String formattedSalary;
}
