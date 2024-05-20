package com.careerit.empstats.dao;

import com.careerit.commons.ConnectionUtil;
import com.careerit.empstats.domain.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class EmployeeStatsDaoImpl implements EmployeeStatsDao{

  private static final String ADD_EMPLOYEE = "insert into employee(id,first_name,last_name,gender,dob,email,salary,country) values(?,?,?,?,?,?,?,?)";
  @Override
  public int loadEmployees(List<Employee> employees) {
    Connection con = null;
    PreparedStatement st = null;
    int count = 0;
    try {
      con = ConnectionUtil.getConnection();
      st = con.prepareStatement(ADD_EMPLOYEE);
      for(Employee emp:employees){
        st.setObject(1, emp.getId());
        st.setString(2, emp.getFirstName());
        st.setString(3, emp.getLastName());
        st.setString(4, emp.getGender());
        st.setObject(5, emp.getDob());
        st.setString(6, emp.getEmail());
        st.setDouble(7, emp.getSalary());
        st.setString(8, emp.getCountry());
        st.addBatch();
      }
      int[] countArr = st.executeBatch();
      count = countArr.length;
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(con, st);
    }
    return count;
  }
}
