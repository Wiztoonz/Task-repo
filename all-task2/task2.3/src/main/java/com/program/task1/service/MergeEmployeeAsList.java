package com.program.task1.service;

import com.program.task1.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class MergeEmployeeAsList {

    private List<Employee> employeeList;

    public MergeEmployeeAsList(){
        employeeList = new ArrayList<>();
    }

    public List<Employee> merge(List<Employee> firstEmployeeList, List<Employee> secondEmployeeList) {
        employeeList.addAll(firstEmployeeList);
        employeeList.addAll(secondEmployeeList);
        return employeeList;
    }

}
