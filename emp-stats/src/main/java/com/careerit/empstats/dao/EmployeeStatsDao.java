package com.careerit.empstats.dao;

import com.careerit.empstats.domain.Employee;

import java.util.List;

public interface EmployeeStatsDao {

    int loadEmployees(List<Employee> employees);
}
