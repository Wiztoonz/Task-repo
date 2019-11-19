package com.program.task1.service;

import com.program.task1.dto.EmployeeDto;
import com.program.task1.entity.EmployeeEntity;
import com.program.task1.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;
    private EmployeeDto employeeDto;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao, EmployeeDto employeeDto) {
        this.employeeDao = employeeDao;
        this.employeeDto = employeeDto;
    }

    @Override
    public void createEmployee(EmployeeEntity employee) {
        employeeDao.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDao.delete(id);
    }

    @Override
    public EmployeeEntity findEmployee(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public void updateEmployee(EmployeeEntity employee, int id) {
        employeeDao.update(employee, id);
    }

    @Override
    public List<EmployeeEntity> findAll() {
        return employeeDao.findAll();
    }

}
