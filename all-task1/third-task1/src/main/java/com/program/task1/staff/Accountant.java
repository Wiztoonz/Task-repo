package com.program.task1.staff;

import com.program.task1.model.Employee;

import java.util.List;

public class Accountant {

    public long amount(List<Employee> employeeList) {
        long result = 0;
        for (Employee employee : employeeList) {
            result += employee.monthSalary(employee.getHourRate(), employee.getWorkTime(), employee.getMonthTime());
        }
        return result;
    }

}
