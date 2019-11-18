package com.program.task1.service;

import com.program.task1.model.Employee;

public class EmployeeArray {

    private Employee[] programmerArray;
    private Employee[] managerArray;
    private int programmerCounter;
    private int managerCounter;

    public EmployeeArray() {
        programmerArray = new Employee[Programmer.getProgrammerCounter()];
        managerArray = new Employee[Manager.getManagerCounter()];
        programmerCounter = 0;
        managerCounter = 0;
    }

    public void createProgrammerArray(Employee programmer) {
        programmerArray[programmerCounter++] = programmer;
    }

    public void createManagerArray(Employee manager) {
        managerArray[managerCounter++] = manager;
    }

    public Employee[] getProgrammerArray() {
        return returnEmployees(programmerArray);
    }

    public Employee[] getManagerArray() {
        return returnEmployees(managerArray);
    }

    private Employee[] sort(Employee[] employees) {
        int EmployeeIndex;
        Employee employee;
        for (int i = 0; i < employees.length - 1; i++) {
            EmployeeIndex = i;
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[j].getId() < employees[EmployeeIndex].getId()) {
                    EmployeeIndex = j;
                }
            }
            employee = employees[i];
            employees[i] = employees[EmployeeIndex];
            employees[EmployeeIndex] = employee;
        }
        return employees;
    }

    private Employee[] duplicate(Employee[] employees) {
        int counterNull = 0;
        int tmpCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i] != null && employees[j] != null) {
                    if (employees[i].getId().equals(employees[j].getId())) {
                        employees[i] = null;
                    }
                }
            }
            if (employees[i] == null) {
                counterNull++;
            }
        }

        Employee[] tmp = new Employee[employees.length - counterNull];
        for (Employee employee : employees) {
            if (employee != null) {
                tmp[tmpCounter++] = employee;
            }
        }

        return tmp.clone();
    }

    private Employee[] returnEmployees(Employee[] employees) {
        Employee[] employeesWithoutDuplicates = duplicate(employees);
        return sort(employeesWithoutDuplicates);
    }

}
