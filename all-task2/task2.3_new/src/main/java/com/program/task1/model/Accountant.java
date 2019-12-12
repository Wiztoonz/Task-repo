package com.program.task1.model;

import java.util.List;

public class Accountant {

    public long amount(List<Employee> employeeList) {
        long result = 0;
        for (Employee employee : employeeList) {
            result += employee.monthSalary();
        }
        return result;
    }

}
