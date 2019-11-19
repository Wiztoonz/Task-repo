package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.logic.Programmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProgrammer {

    private Employee p1;

    @Before
    public void init() {
        p1 = new Programmer();
    }

    @Test
    public void testTimePercentForProgrammer1() {
        p1.setRate(1000);
        p1.setHour(168);
        int timePercent = (int) p1.getTimePercent();
        Assert.assertEquals(timePercent, 100);
    }

    @Test
    public void testTimePercentForProgrammer2() {
        p1.setRate(1000);
        p1.setHour(160);
        int timePercent = (int) p1.getTimePercent();
        Assert.assertEquals(timePercent, 95);
    }

    @Test
    public void testTimePercentForProgrammer3() {
        p1.setRate(500);
        p1.setHour(181);
        int timePercent = (int) p1.getTimePercent();
        Assert.assertEquals(timePercent, 107);
    }

    @Test
    public void testMonthSalaryForProgrammer1() {
        p1.setRate(1000);
        p1.setHour(168);
        int salary = (int) p1.monthSalary();
        Assert.assertEquals(salary, 1000);
    }

    @Test
    public void testMonthSalaryForProgrammer2() {
        p1.setRate(1000);
        p1.setHour(160);
        int salary = (int) p1.monthSalary();
        Assert.assertEquals(salary, 952);
    }

    @Test
    public void testMonthSalaryForProgrammer3() {
        p1.setRate(500);
        p1.setHour(181);
        int salary = (int) p1.monthSalary();
        Assert.assertEquals(salary, 538);
    }
}
