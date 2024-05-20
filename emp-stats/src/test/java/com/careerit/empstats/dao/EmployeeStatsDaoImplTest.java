package com.careerit.empstats.dao;

import com.careerit.empstats.domain.Employee;
import com.careerit.empstats.util.EmployeeJsonReaderUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeStatsDaoImplTest {

    private EmployeeStatsDao employeeStatsDao;
    @Test
    void addEmployeesTest() {
        employeeStatsDao = new EmployeeStatsDaoImpl();
        List<Employee> empList = EmployeeJsonReaderUtil.readEmployees("employees_test.json");
        int count = employeeStatsDao.loadEmployees(empList);
        Assertions.assertEquals(empList.size(), count);
    }
    @BeforeEach
    void clearData() {
        SeedDataUtil.clearData("employee");
    }

}
