package com.careerit.sb.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
  @Override
  public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
    Employee employee = new Employee();
    employee.setEmpno(rs.getLong("empno"));
    employee.setName(rs.getString("name"));
    employee.setSalary(rs.getDouble("salary"));
    return employee;
  }
}
