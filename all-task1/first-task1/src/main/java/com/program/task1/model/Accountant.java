package com.program.task1.model;

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
