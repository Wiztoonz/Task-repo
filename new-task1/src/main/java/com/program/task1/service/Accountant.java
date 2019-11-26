package com.program.task1.service;

import com.program.task1.model.Employee;
import com.program.task1.model.EmployeeImpl;

import java.util.List;

public class Accountant implements Employee {

    public double amount(List<EmployeeImpl> employeeImplList) {
        double result = 0.0;
        for (EmployeeImpl employeeImpl : employeeImplList) {
            result += employeeImpl.monthSalary();
        }
        return result;
    }

}
