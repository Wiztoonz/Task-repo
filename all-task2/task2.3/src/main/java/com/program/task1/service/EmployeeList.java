package com.program.task1.service;

import com.program.task1.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeList {

    private List<Employee> employeeList;

    public EmployeeList() {
        employeeList = new ArrayList<>();
    }

    public boolean addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee != null;
    }

    public List<Employee> getEmployeeList() {
        Map<Integer, Employee> uniqEmployees = new HashMap<>();
        for (Employee employee : employeeList) {
            uniqEmployees.put(employee.getId(), employee);
        }
        employeeList = new ArrayList<>();
        for (Map.Entry<Integer, Employee> employee : uniqEmployees.entrySet()) {
            employeeList.add(employee.getValue());
        }
        return employeeList;
    }

}
