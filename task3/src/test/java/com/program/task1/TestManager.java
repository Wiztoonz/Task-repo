package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.service.Manager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestManager {

    private Employee m1;

    @Before
    public void init() {
        m1 = new Manager();
        m1.setName("Aggramar");
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
        Assert.assertEquals(salary, 1142);
    }

    @Test
    public void testMonthSalaryForManager3() {
        m1.setRate(1000);
        m1.setHour(174);
        int salary = (int) m1.monthSalary();
        Assert.assertEquals(salary, 1000);
    }

}
