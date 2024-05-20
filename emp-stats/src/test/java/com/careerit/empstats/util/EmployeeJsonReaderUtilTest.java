package com.careerit.empstats.util;

import com.careerit.empstats.domain.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeJsonReaderUtilTest {

    @Test
    void readEmployeesTest() {
      List<Employee> empList = EmployeeJsonReaderUtil.readEmployees("employees_test.json");
      Assertions.assertEquals(50, empList.size());
    }


}
