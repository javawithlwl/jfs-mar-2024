package com.careerit.empstats.util;

import com.careerit.commons.JsonUtil;
import com.careerit.empstats.domain.Employee;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeJsonReaderUtil {

  private EmployeeJsonReaderUtil() {
    throw new UnsupportedOperationException("Object creation is not allowed");
  }

  public static List<Employee> readEmployees(String fileName) {
    ObjectMapper mapper = JsonUtil.getObjectMapper();
    List<Employee> empList = new ArrayList<>();
    try {
      empList = mapper.readValue(EmployeeJsonReaderUtil.class.getResourceAsStream("/"+fileName), new TypeReference<List<Employee>>() {
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
    return empList;
  }

}
