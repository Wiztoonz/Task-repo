package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.model.Manager;
import com.program.task1.model.Programmer;
import com.program.task1.employeeUtil.Merge;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMerge {

    private Employee p1;
    private Employee p2;
    private Employee m1;
    private Employee m2;

    @Before
    public void init() {
        p1 = new Programmer();
        p2 = new Programmer();
        m1 = new Manager();
        m2 = new Manager();
    }

    @Test
    public void testMergeMethod() {
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);

        p2.setHourRate(10);
        p2.setWorkTime(173);
        p2.setMonthTime(168);

        m1.setHourRate(10);
        m1.setWorkTime(168);
        m1.setMonthTime(168);

        m2.setHourRate(10);
        m2.setWorkTime(180);
        m2.setMonthTime(168);

        List<Employee> firstEmployeeList = new ArrayList<>();
        firstEmployeeList.add(p1);
        firstEmployeeList.add(p2);

        List<Employee> secondEmployeeList = new ArrayList<>();
        secondEmployeeList.add(m1);
        secondEmployeeList.add(m2);

        List<Employee> merge = Merge.merge(firstEmployeeList, secondEmployeeList);


        List<Employee> needList = new ArrayList<>();
        needList.add(p1);
        needList.add(p2);
        needList.add(m2);
        Collections.sort(needList);

        boolean result = needList.containsAll(merge);

        Assert.assertTrue(result);
    }


}
