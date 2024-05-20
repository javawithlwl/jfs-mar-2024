package com.careerit.empstats.service;

import com.careerit.empstats.dao.EmployeeStatsDao;
import com.careerit.empstats.domain.Employee;
import com.careerit.empstats.util.EmployeeJsonReaderUtil;

import java.util.List;

public class EmployeeStatsServiceImpl implements EmployeeStatsService {

  private EmployeeStatsDao employeeStatsDao;

  public EmployeeStatsServiceImpl(EmployeeStatsDao employeeStatsDao) {
    this.employeeStatsDao = employeeStatsDao;
  }

  @Override
  public int loadEmployees(String fileName) {
    if (fileName == null || fileName.isEmpty()) {
      throw new IllegalArgumentException("File name should not be null or empty");
    }
    List<Employee> employees = EmployeeJsonReaderUtil.readEmployees(fileName);
    System.out.println("File has total " + employees.size() + " employees");
    return employeeStatsDao.loadEmployees(employees);
  }
}
