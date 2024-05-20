package com.careerit.empstats;

import com.careerit.empstats.dao.EmployeeStatsDao;
import com.careerit.empstats.dao.EmployeeStatsDaoImpl;
import com.careerit.empstats.service.EmployeeStatsService;
import com.careerit.empstats.service.EmployeeStatsServiceImpl;

public class EmployeeManager {

  public static void main(String[] args) {
    EmployeeStatsDao employeeStatsDao = new EmployeeStatsDaoImpl();
    EmployeeStatsService employeeStatsService = new EmployeeStatsServiceImpl(employeeStatsDao);
    int count = employeeStatsService.loadEmployees("employees.json");
    System.out.println("Total employees added: " + count);

  }
}
