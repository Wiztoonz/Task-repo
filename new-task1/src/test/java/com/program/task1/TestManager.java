package com.program.task1;

import com.program.task1.model.EmployeeImpl;
import com.program.task1.service.Manager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestManager {

    private EmployeeImpl m1;

    @Before
    public void init() {
        m1 = new Manager(8, 168, 21, 168);
    }

    @Test
    public void testTimePercentForManager1() {
        m1.setRate(800);
        m1.setHour(168);
        int timePercent = (int) m1.getTimePercent();
        Assert.assertEquals(timePercent, 100);
    }

    @Test
    public void testTimePercentForManager2() {
        m1.setRate(1200);
        m1.setHour(160);
        int timePercent = (int) m1.getTimePercent();
        Assert.assertEquals(timePercent, 95);
    }
    @Test
    public void testTimePercentForManager3() {
        m1.setRate(1000);
        m1.setHour(174);
        int timePercent = (int) m1.getTimePercent();
        Assert.assertEquals(timePercent, 103);
    }

    @Test
    public void testMonthSalaryForManager1() {
        m1.setRate(800);
        m1.setHour(168);
        int salary = (int) m1.monthSalary();
        Assert.assertEquals(salary, 800);
    }

    @Test
    public void testMonthSalaryForManager2() {
        m1.setRate(1200);
        m1.setHour(160);
        int salary = (int) m1.monthSalary();
        Assert.assertEquals(salary, 1088);
    }

    @Test
    public void testMonthSalaryForManager3() {
        m1.setRate(1000);
        m1.setHour(174);
        int salary = (int) m1.monthSalary();
        Assert.assertEquals(salary, 1035);
    }

}
