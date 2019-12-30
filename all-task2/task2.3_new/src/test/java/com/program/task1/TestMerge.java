package com.program.task1;

import com.program.task1.employeeUtil.Merge;
import com.program.task1.model.Employee;
import com.program.task1.model.Manager;
import com.program.task1.model.Programmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMerge {

    private Employee p1;
    private Employee p2;
    private Employee p3;
    private Employee m1;
    private Employee m2;
    private Employee m3;
    private Employee m4;

    @Before
    public void init() {
        p1 = new Programmer();
        p2 = new Programmer();
        p3 = new Programmer();
        m1 = new Manager();
        m2 = new Manager();
        m3 = new Manager();
        m4 = new Manager();
    }

    @Test
    public void testMergeMethod() {
        p1.setId(1);
        p1.setSpecialty("programmer");
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);

        p2.setId(2);
        p2.setSpecialty("programmer");
        p2.setHourRate(10);
        p2.setWorkTime(173);
        p2.setMonthTime(168);

        m1.setId(2);
        m1.setSpecialty("manager");
        m1.setHourRate(10);
        m1.setWorkTime(168);
        m1.setMonthTime(168);

        m2.setId(3);
        m2.setSpecialty("manager");
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

        System.out.println("test 1");
        System.out.println(merge + " m");
        List<Employee> needList = new ArrayList<>();
        needList.add(m1);
        needList.add(m2);
        System.out.println(needList + " n");

        boolean result = false;
        for (Employee employee : needList) {
            for (Employee value : merge) {
                result = employee.equals(value);
            }
        }

        if (merge.size() != needList.size()) {
            result = false;
        }

        Assert.assertTrue(result);
    }

    @Test
    public void testMergeMethod1() {
        p1.setId(1);
        p1.setSpecialty("programmer");
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);

        p2.setId(2);
        p2.setSpecialty("programmer");
        p2.setHourRate(10);
        p2.setWorkTime(173);
        p2.setMonthTime(168);

        m1.setId(2);
        m1.setSpecialty("manager");
        m1.setHourRate(10);
        m1.setWorkTime(100);
        m1.setMonthTime(168);

        m2.setId(3);
        m2.setSpecialty("manager");
        m2.setHourRate(10);
        m2.setWorkTime(180);
        m2.setMonthTime(168);

        m3.setId(4);
        m3.setSpecialty("manager");
        m3.setHourRate(10);
        m3.setWorkTime(100);
        m3.setMonthTime(100);

        List<Employee> firstEmployeeList = new ArrayList<>();
        firstEmployeeList.add(p1);
        firstEmployeeList.add(p2);
        firstEmployeeList.add(m3);

        List<Employee> secondEmployeeList = new ArrayList<>();
        secondEmployeeList.add(m2);
        secondEmployeeList.add(m1);
        secondEmployeeList.add(p2);

        List<Employee> merge = Merge.merge(firstEmployeeList, secondEmployeeList);

        System.out.println("test 2");
        List<Employee> needList = new ArrayList<>();
        needList.add(m2);
        needList.add(m1);
        needList.add(p2);
        System.out.println(merge + " m");
        System.out.println(needList + " n");

        boolean result = false;
        for (Employee employee : needList) {
            for (Employee value : merge) {
                result = employee.equals(value);
            }
        }

        if (merge.size() != needList.size()) {
            result = false;
        }

        Assert.assertTrue(result);
    }

    @Test
    public void testMergeMethod2() {
        p1.setId(1);
        p1.setSpecialty("programmer");
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);

        p2.setId(2);
        p2.setSpecialty("programmer");
        p2.setHourRate(10);
        p2.setWorkTime(173);
        p2.setMonthTime(168);

        m1.setId(2);
        m1.setSpecialty("manager");
        m1.setHourRate(10);
        m1.setWorkTime(100);
        m1.setMonthTime(168);

        m2.setId(3);
        m2.setSpecialty("manager");
        m2.setHourRate(10);
        m2.setWorkTime(180);
        m2.setMonthTime(168);

        m3.setId(4);
        m3.setSpecialty("manager");
        m3.setHourRate(10);
        m3.setWorkTime(100);
        m3.setMonthTime(100);

        List<Employee> firstEmployeeList = new ArrayList<>();
        firstEmployeeList.add(p1);
        firstEmployeeList.add(p2);
        firstEmployeeList.add(m3); // d

        List<Employee> secondEmployeeList = new ArrayList<>();
        secondEmployeeList.add(m2); // add
        secondEmployeeList.add(m1); // add
        secondEmployeeList.add(p1); // u
        secondEmployeeList.add(p2); // u

        List<Employee> merge = Merge.merge(firstEmployeeList, secondEmployeeList);

        System.out.println("test 3");
        List<Employee> needList = new ArrayList<>();
        needList.add(p2);
        needList.add(m2);
        needList.add(m1);
        needList.add(p1);
        System.out.println(merge + " m");
        System.out.println(needList + " n");

        boolean result = false;
        for (Employee employee : needList) {
            for (Employee value : merge) {
                result = employee.equals(value);
            }
        }

        if (merge.size() != needList.size()) {
            result = false;
        }

        Assert.assertTrue(result);
    }

}
