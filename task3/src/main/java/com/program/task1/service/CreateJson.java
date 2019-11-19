package com.program.task1.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.program.task1.model.Employee;
import com.program.task1.model.EmployeeDTO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateJson {

    private static ObjectMapper objectMapper;
    private static List<EmployeeDTO> employeeList = new ArrayList<>();
    private static File file;

    static {
        objectMapper = new ObjectMapper();
    }

    public static boolean writeJson(String fileName, List<Employee> employeeList) {
        try {
            file = new File(fileName.concat(".json"));
            objectMapper.writeValue(file, employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file.exists();
    }

    public static List<Employee> readJson(String fileName) {
        try {
            employeeList = objectMapper.readValue(new File(fileName.concat(".json")), new TypeReference<ArrayList<EmployeeDTO>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return convertData(employeeList);
    }

    private static List<Employee> convertData(List<EmployeeDTO> employeeDTOS) {
        List<Employee> employees = new ArrayList<>();
        for (EmployeeDTO employeeDTO : employeeDTOS) {
            Employee programmer = new Programmer();
            Employee manager = new Manager();
            if (employeeDTO.getStatus().equals(Status.programmer())) {
                programmer.setName(employeeDTO.getName());
                programmer.setHour(employeeDTO.getTime());
                programmer.setRate(employeeDTO.getMonthSalary());
                programmer.setStatus(employeeDTO.getStatus());
                employees.add(programmer);
            }
            if (employeeDTO.getStatus().equals(Status.manager())) {
                manager.setName(employeeDTO.getName());
                manager.setHour(employeeDTO.getTime());
                manager.setRate(employeeDTO.getMonthSalary());
                manager.setStatus(employeeDTO.getStatus());
                employees.add(manager);
            }
        }
        return employees;
    }

}
