package com.program.task1.dto;

import com.program.task1.entity.EmployeeEntity;
import com.program.task1.logic.Status;
import com.program.task1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDto {

    private Employee programmer;
    private Employee manager;

    @Autowired
    public EmployeeDto(Employee programmer, Employee manager) {
        this.programmer = programmer;
        this.manager = manager;
    }

    public Employee employeeEntityToEmployee(EmployeeEntity employee) {
        if (employee.getStatus().equals(Status.programmer())) {
            programmer.setName(employee.getName());
            programmer.setRate(employee.getRate());
            programmer.setHour(employee.getTime());
            programmer.setStatus(employee.getStatus());
            return programmer;
        }
        if (employee.getStatus().equals(Status.manager())) {
            manager.setName(employee.getName());
            manager.setRate(employee.getRate());
            manager.setHour(employee.getTime());
            manager.setStatus(employee.getStatus());
            return manager;
        }
        throw new RuntimeException("Employee = null");
    }

}
