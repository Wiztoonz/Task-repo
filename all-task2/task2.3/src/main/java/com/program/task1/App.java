package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.service.*;

import java.util.List;

// Employee has unique id and cannot be more than one employee with it
// Class (EmployeeList) has (addEmployee) method which add only one employee with unique id
// When use merge can be have same id employee for programmers and managers*

public class App {

    public static void main(String[] args) {

        // create Programmers List
        EmployeeList programmerList = new EmployeeList();

        // add programmers
        programmerList.addEmployee(new Programmer(1,"Рагнарос", Status.programmer(), 168, 1000));
        programmerList.addEmployee(new Programmer(1,"Рагнарос", Status.programmer(),168, 1000));
        programmerList.addEmployee(new Programmer(2,"Рексар", Status.programmer(),160, 2000));
        programmerList.addEmployee(new Programmer(2,"Рексар", Status.programmer(),160, 2000));
        programmerList.addEmployee(new Programmer(3,"Ануб'арак", Status.programmer(),180, 3200));
        programmerList.addEmployee(new Programmer(3,"Ануб'арак", Status.programmer(),180, 3200));
        programmerList.addEmployee(new Programmer(4,"Гул'дан", Status.programmer(),168, 100));
        programmerList.addEmployee(new Programmer(5,"Гул'дан", Status.programmer(),168, 100));
        programmerList.addEmployee(new Programmer(6,"Медив", Status.programmer(),180, 500));
        programmerList.addEmployee(new Programmer(6,"Медив", Status.programmer(),180, 500));
        programmerList.addEmployee(new Programmer(7,"Артас", Status.programmer(),168, 5000));
        programmerList.addEmployee(new Programmer(7,"Артас", Status.programmer(),168, 5000));

        // get list of programmers
        List<Employee> programmers = programmerList.getEmployeeList();

        // create Managers List
        EmployeeList managerList = new EmployeeList();

        // add managers
        managerList.addEmployee(new Manager(1,"Нер'зул", Status.manager(),168, 1000));
        managerList.addEmployee(new Manager(1,"Нер'зул", Status.manager(),168, 1000));
        managerList.addEmployee(new Manager(2,"Вол'джин", Status.manager(),160, 2000));
        managerList.addEmployee(new Manager(2,"Вол'джин", Status.manager(),160, 2000));
        managerList.addEmployee(new Manager(3,"Саурфанг", Status.manager(),180, 3200));
        managerList.addEmployee(new Manager(3,"Саурфанг", Status.manager(),180, 3200));
        managerList.addEmployee(new Manager(4,"Броксигар", Status.manager(),168, 100));
        managerList.addEmployee(new Manager(4,"Броксигар", Status.manager(),168, 100));
        managerList.addEmployee(new Manager(5,"Саргерас", Status.manager(),180, 500));
        managerList.addEmployee(new Manager(5,"Саргерас", Status.manager(),180, 500));
        managerList.addEmployee(new Manager(6,"Ронин", Status.manager(),168, 5000));
        managerList.addEmployee(new Manager(6,"Ронин", Status.manager(),168, 5000));
        managerList.addEmployee(new Manager(7,"Алоди", Status.manager(),168, 5000));
        managerList.addEmployee(new Manager(7,"Алоди", Status.manager(),168, 5000));

        // get list of managers
        List<Employee> managers = managerList.getEmployeeList();

        MergeEmployeeAsList mergeProgrammers = new MergeEmployeeAsList();

        // merge managers with programmers*
        List<Employee> merge = mergeProgrammers.merge(managers, programmers);


        // merge result
        for (Employee employee : merge) {
            System.out.println(employee);
        }

    }

}
