package com.program.task1.service;

import com.program.task1.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    void createEmployee(EmployeeEntity employee);

    void deleteEmployee(int id);

    EmployeeEntity findEmployee(int id);

    void updateEmployee(EmployeeEntity employee, int id);

    List<EmployeeEntity> findAll();

}
