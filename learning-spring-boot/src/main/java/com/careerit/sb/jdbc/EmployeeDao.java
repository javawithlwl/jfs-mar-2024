package com.careerit.sb.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class EmployeeDao {

    private final JdbcTemplate jdbcTemplate;

    // Create Table Employee

    public void createTable() {
       String sql = """
             CREATE TABLE IF NOT EXISTS employee(
                empno bigserial PRIMARY KEY,
                name VARCHAR(50),
                salary numeric(10,2)
            );
       """;
        jdbcTemplate.execute(sql);
    }

    // Add Employee

    public long addEmployee(String name, double salary) {
        String sql = "INSERT INTO employee(name,salary) VALUES(?,?)";
        // return the generated key
      KeyHolder keyHolder = new GeneratedKeyHolder();
      jdbcTemplate.update(connection -> {
          PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          ps.setString(1,name);
          ps.setDouble(2,salary);
          return ps;
      },keyHolder);
      return (long)keyHolder.getKeys().get("empno");

    }

    // Update Employee

    public void updateEmployee(long empno, double increment) {
        String sql = "UPDATE employee SET salary = salary + ? WHERE empno = ?";
        jdbcTemplate.update(sql,increment,empno);
    }

    // Delete Employee

    public void deleteEmployee(long empno) {
        String sql = "DELETE FROM employee WHERE empno = ?";
        jdbcTemplate.update(sql,empno);
    }

    // Get Employee By Id

    public Employee getEmployeeById(long empno) {
        String sql = "SELECT empno,name,salary::float FROM employee WHERE empno = ?";
        return jdbcTemplate.queryForObject(sql,new EmployeeMapper(),empno);
    }


    // Get All Employees
    public List<Employee> getAllEmployees() {
        String sql = "SELECT empno,name,salary::float FROM employee";
        return jdbcTemplate.query(sql,new EmployeeMapper());
    }

    // Search Employee By Name
    public List<Employee> searchEmployeeByName(String name) {
        String sql = "SELECT empno,name,salary::float FROM employee WHERE name LIKE ?";
        return jdbcTemplate.query(sql,new EmployeeMapper(),"%"+name+"%");
    }


}
