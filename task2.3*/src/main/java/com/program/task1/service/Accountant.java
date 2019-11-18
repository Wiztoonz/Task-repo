package com.program.task1.service;

import com.program.task1.model.Employee;

import java.util.List;

public class Accountant {

    public double amount(List<Employee> employeeList) {
        double result = 0.0;
        for (Employee employee : employeeList) {
            result += employee.monthSalary();
        }
        return result;
    }

}
