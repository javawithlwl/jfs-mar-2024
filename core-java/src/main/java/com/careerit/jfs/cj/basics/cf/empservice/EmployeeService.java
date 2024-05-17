package com.careerit.jfs.cj.basics.cf.empservice;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class EmployeeService {

        List<Employee> employees;
        List<CurrencyWithSymbol> currencies;

        public EmployeeService() {
            JsonReaderUtil jsonReaderUtil = new JsonReaderUtil();
            employees = jsonReaderUtil.readJson("/employees.json", new TypeReference<List<Employee>>(){});
            currencies = jsonReaderUtil.readJson("/currency_symbol.json", new TypeReference<List<CurrencyWithSymbol>>(){});

            System.out.println("Employee count :"+employees.size());
            System.out.println("Currency count :"+currencies.size());
        }

        public List<EmployeeDetails> getEmployeeDetails(){
            return null;
        }
}
