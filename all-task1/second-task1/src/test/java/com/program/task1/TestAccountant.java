package com.program.task1;

import com.program.task1.service.Accountant;
import com.program.task1.model.EmployeeImpl;
import com.program.task1.service.Manager;
import com.program.task1.service.Programmer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAccountant {

    @Test
    public void testAmountForProgrammer() {
        EmployeeImpl p1 = new Programmer(8, 168, 21, 168);
        p1.setRate(1000);
        p1.setHour(168);

        EmployeeImpl p2 = new Programmer(8, 168, 21, 168);
        p2.setRate(1000);
        p2.setHour(160);

        EmployeeImpl p3 = new Programmer(8, 168, 21, 168);
        p3.setRate(500);
        p3.setHour(181);

        List<EmployeeImpl> programmerList = new ArrayList<>();
        programmerList.add(p1);
        programmerList.add(p2);
        programmerList.add(p3);

        Accountant accountant = new Accountant();
        int amount = (int) accountant.amount(programmerList);

        Assert.assertEquals(amount, 2487);
    }

    @Test
    public void testAmountForManager() {
        EmployeeImpl m1 = new Manager(8, 168, 21, 168);
        m1.setRate(800);
        m1.setHour(168);

        EmployeeImpl m2 = new Manager(8, 168, 21, 168);
        m2.setRate(1200);
        m2.setHour(160);

        EmployeeImpl m3 = new Manager(8, 168, 21, 168);
        m3.setRate(1000);
        m3.setHour(174);

        List<EmployeeImpl> managerList = new ArrayList<>();
        managerList.add(m1);
        managerList.add(m2);
        managerList.add(m3);

        Accountant accountant = new Accountant();
        int amount = (int) accountant.amount(managerList);

        Assert.assertEquals(amount, 2924);
    }

    @Test
    public void testAmountForProgrammerAndManager() {
        EmployeeImpl p1 = new Programmer(8, 168, 21, 168);
        p1.setRate(1000);
        p1.setHour(168);

        EmployeeImpl p2 = new Programmer(8, 168, 21, 168);
        p2.setRate(1000);
        p2.setHour(160);

        EmployeeImpl p3 = new Programmer(8, 168, 21, 168);
        p3.setRate(500);
        p3.setHour(181);

        EmployeeImpl m1 = new Manager(8, 168, 21, 168);
        m1.setRate(800);
        m1.setHour(168);

        EmployeeImpl m2 = new Manager(8, 168, 21, 168);
        m2.setRate(1200);
        m2.setHour(160);

        EmployeeImpl m3 = new Manager(8, 168, 21, 168);
        m3.setRate(1000);
        m3.setHour(174);

        List<EmployeeImpl> employeeImplList = new ArrayList<>();
        employeeImplList.add(p1);
        employeeImplList.add(p2);
        employeeImplList.add(p3);
        employeeImplList.add(m1);
        employeeImplList.add(m2);
        employeeImplList.add(m3);

        Accountant accountant = new Accountant();
        int amount = (int) accountant.amount(employeeImplList);

        Assert.assertEquals(amount, 5411);

    }

}
