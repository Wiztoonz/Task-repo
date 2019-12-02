package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.service.EmployeeList;
import com.program.task1.service.Manager;
import com.program.task1.service.Programmer;
import com.program.task1.service.Status;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListTest {

    private EmployeeList programmerList;
    private EmployeeList managerList;

    @Before
    public void init() {
        programmerList = new EmployeeList();
        managerList = new EmployeeList();
    }

    @Test
    public void addEmployeeProgrammer() {
        boolean result = programmerList.addEmployee(new Programmer(6, "Медив", Status.programmer(), 180, 500));
        Assert.assertTrue(result);
    }

    @Test
    public void addEmployeeManager() {
        boolean result = managerList.addEmployee(new Manager(5, "Саргерас", Status.manager(), 180, 500));
        Assert.assertTrue(result);
    }

    @Test
    public void getEmployeeListProgrammer() {
        programmerList.addEmployee(new Programmer(6,"Медив", Status.programmer(),180, 500));
        programmerList.addEmployee(new Programmer(6,"Медив", Status.programmer(),180, 500));
        programmerList.addEmployee(new Programmer(7,"Артас", Status.programmer(),168, 5000));
        programmerList.addEmployee(new Programmer(7,"Артас", Status.programmer(),168, 5000));

        Employee p1 = new Programmer(6,"Медив", Status.programmer(),180, 500);
        Employee p2 = new Programmer(7,"Артас", Status.programmer(),168, 5000);
        List<Employee> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        List<Employee> programmers = programmerList.getEmployeeList();

        boolean result = programmers.containsAll(list);
        Assert.assertTrue(result);
    }

    @Test
    public void getEmployeeListManager() {
        managerList.addEmployee(new Manager(7,"Алоди", Status.manager(),168, 5000));
        managerList.addEmployee(new Manager(7,"Алоди", Status.manager(),168, 5000));
        managerList.addEmployee(new Manager(5,"Саргерас", Status.manager(),180, 500));
        managerList.addEmployee(new Manager(5,"Саргерас", Status.manager(),180, 500));

        Employee m1 = new Manager(7,"Алоди", Status.manager(),168, 5000);
        Employee m2 = new Manager(5,"Саргерас", Status.manager(),180, 500);
        List<Employee> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);

        List<Employee> managers = managerList.getEmployeeList();

        boolean result = managers.containsAll(list);
        Assert.assertTrue(result);
    }

}
