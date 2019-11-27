package com.program.task1;

import com.program.task1.model.Accountant;
import com.program.task1.model.Employee;
import com.program.task1.model.Manager;
import com.program.task1.model.Programmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

    private Employee p1;
    private Employee p2;
    private Employee p3;
    private Employee m1;
    private Employee m2;
    private Employee m3;

    @Before
    public void init() {
        p1 = new Programmer();
        p2 = new Programmer();
        p3 = new Programmer();
        m1 = new Manager();
        m2 = new Manager();
        m3 = new Manager();
    }

    @Test
    public void testProgrammer1() {
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);
        long percent = p1.timePercent();
        long salary = p1.monthSalary();
        Assert.assertEquals(percent, 100);
        Assert.assertEquals(salary, 1680);
    }

    @Test
    public void testProgrammer2() {
        p2.setHourRate(10);
        p2.setWorkTime(173);
        p2.setMonthTime(168);
        long percent = p2.timePercent();
        long salary = p2.monthSalary();
        Assert.assertEquals(percent, 103);
        Assert.assertEquals(salary, 1730);
    }

    @Test
    public void testProgrammer3() {
        p3.setHourRate(10);
        p3.setWorkTime(150);
        p3.setMonthTime(168);
        long percent = p3.timePercent();
        long salary = p3.monthSalary();
        Assert.assertEquals(percent, 89);
        Assert.assertEquals(salary, 1500);
    }

    @Test
    public void testManager1() {
        m1.setHourRate(10);
        m1.setWorkTime(168);
        m1.setMonthTime(168);
        long percent = m1.timePercent();
        long salary = m1.monthSalary();
        Assert.assertEquals(percent, 100);
        Assert.assertEquals(salary, 1680);
    }

    @Test
    public void testManager2() {
        m2.setHourRate(10);
        m2.setWorkTime(180);
        m2.setMonthTime(168);
        long percent = m2.timePercent();
        long salary = m2.monthSalary();
        Assert.assertEquals(percent, 107);
        Assert.assertEquals(salary, 1680);
    }

    @Test
    public void testManager3() {
        m3.setHourRate(10);
        m3.setWorkTime(140);
        m3.setMonthTime(168);
        long percent = m3.timePercent();
        long salary = m3.monthSalary();
        Assert.assertEquals(percent, 83);
        Assert.assertEquals(salary, 1400);
    }

    @Test
    public void testAccountant() {
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);
        p1.timePercent();
        p1.monthSalary();

        p2.setHourRate(10);
        p2.setWorkTime(173);
        p2.setMonthTime(168);
        p2.timePercent();
        p2.monthSalary();

        p3.setHourRate(10);
        p3.setWorkTime(150);
        p3.setMonthTime(168);
        p3.timePercent();
        p3.monthSalary();

        m1.setHourRate(10);
        m1.setWorkTime(168);
        m1.setMonthTime(168);
        m1.timePercent();
        m1.monthSalary();

        m2.setHourRate(10);
        m2.setWorkTime(180);
        m2.setMonthTime(168);
        m2.timePercent();
        m2.monthSalary();

        m3.setHourRate(10);
        m3.setWorkTime(140);
        m3.setMonthTime(168);
        m3.timePercent();
        m3.monthSalary();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(p1);
        employeeList.add(p2);
        employeeList.add(p3);
        employeeList.add(m1);
        employeeList.add(m2);
        employeeList.add(m3);

        Accountant accountant = new Accountant();
        long amount = accountant.amount(employeeList);
        Assert.assertEquals(amount, 9670);
    }


}
