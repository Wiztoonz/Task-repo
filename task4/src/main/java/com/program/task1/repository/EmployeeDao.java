package com.program.task1.repository;


import com.program.task1.entity.EmployeeEntity;

import java.io.Serializable;
import java.util.List;

public interface EmployeeDao {

    Serializable save(EmployeeEntity employee);

    void update(EmployeeEntity employee, Serializable id);

    EmployeeEntity findById(Serializable id);

    void delete(Serializable id);

    List<EmployeeEntity> findAll();

}
