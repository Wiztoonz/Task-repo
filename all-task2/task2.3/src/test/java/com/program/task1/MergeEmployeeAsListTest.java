package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.service.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MergeEmployeeAsListTest {

    private EmployeeList programmerList;
    private EmployeeList managerList;
    MergeEmployeeAsList mergeProgrammers;

    @Before
    public void init() {
        // create Programmers and Manager List
        programmerList = new EmployeeList();
        managerList = new EmployeeList();

        // create class for merge
        mergeProgrammers = new MergeEmployeeAsList();
    }

    @Test
    public void mergeTest() {
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

        // get list of programmers
        List<Employee> programmers = programmerList.getEmployeeList();

        // get list of managers
        List<Employee> managers = managerList.getEmployeeList();

        // merge
        List<Employee> merge = mergeProgrammers.merge(programmers, managers);

        boolean resultProgrammers = merge.containsAll(programmers);
        boolean resultManagers = merge.containsAll(managers);
        boolean result = resultProgrammers && resultManagers;

        Assert.assertTrue(result);
    }

}
