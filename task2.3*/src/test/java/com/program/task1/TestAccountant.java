package com.program.task1;

import com.program.task1.service.Accountant;
import com.program.task1.model.Employee;
import com.program.task1.service.Manager;
import com.program.task1.service.Programmer;
import com.program.task1.service.Status;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAccountant {

    @Test
    public void testAmountForProgrammer() {
        Employee p1 = new Programmer(Status.programmer());
        p1.setId(1);
        p1.setRate(1000);
        p1.setHour(168);

        Employee p2 = new Programmer(Status.programmer());
        p2.setId(2);
        p2.setRate(1000);
        p2.setHour(160);

        Employee p3 = new Programmer(Status.programmer());
        p3.setId(3);
        p3.setRate(500);
        p3.setHour(181);

        List<Employee> programmerList = new ArrayList<>();
        programmerList.add(p1);
        programmerList.add(p2);
        programmerList.add(p3);

        Accountant accountant = new Accountant();
        int amount = (int) accountant.amount(programmerList);

        Assert.assertEquals(amount, 2491);
    }

    @Test
    public void testAmountForManager() {
        Employee m1 = new Manager(Status.manager());
        m1.setId(1);
        m1.setRate(800);
        m1.setHour(168);

        Employee m2 = new Manager(Status.manager());
        m2.setId(2);
        m2.setRate(1200);
        m2.setHour(160);

        Employee m3 = new Manager(Status.manager());
        m3.setId(3);
        m3.setRate(1000);
        m3.setHour(174);

        List<Employee> managerList = new ArrayList<>();
        managerList.add(m1);
        managerList.add(m2);
        managerList.add(m3);

        Accountant accountant = new Accountant();
        int amount = (int) accountant.amount(managerList);

        Assert.assertEquals(amount, 2942);
    }

    @Test
    public void testAmountForProgrammerAndManager() {
        Employee p1 = new Programmer(Status.programmer());
        p1.setId(1);
        p1.setRate(1000);
        p1.setHour(168);

        Employee p2 = new Programmer(Status.programmer());
        p2.setId(2);
        p2.setRate(1000);
        p2.setHour(160);

        Employee p3 = new Programmer(Status.programmer());
        p3.setId(3);
        p3.setRate(500);
        p3.setHour(181);

        Employee m1 = new Manager(Status.manager());
        m1.setId(1);
        m1.setRate(800);
        m1.setHour(168);

        Employee m2 = new Manager(Status.manager());
        m2.setId(2);
        m2.setRate(1200);
        m2.setHour(160);

        Employee m3 = new Manager(Status.manager());
        m3.setId(3);
        m3.setRate(1000);
        m3.setHour(174);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(p1);
        employeeList.add(p2);
        employeeList.add(p3);
        employeeList.add(m1);
        employeeList.add(m2);
        employeeList.add(m3);

        Accountant accountant = new Accountant();
        int amount = (int) accountant.amount(employeeList);

        Assert.assertEquals(amount, 5433);

    }

}
