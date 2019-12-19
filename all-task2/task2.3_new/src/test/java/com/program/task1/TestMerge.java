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
        p1.setId(1);                //
        p1.setHourRate(10);         //  \___ Удалиться так как его нет в [B]
        p1.setWorkTime(168);        //  /
        p1.setMonthTime(168);       //

        p2.setId(2);                //
        p2.setHourRate(10);         // \_____ Этот элемент будет заменен
        p2.setWorkTime(173);        // /
        p2.setMonthTime(168);       //

        m1.setId(2);              //
        m1.setHourRate(10);       //  \____ Заменит элемент с индексом 2
        m1.setWorkTime(168);      //  /
        m1.setMonthTime(168);     //

        m2.setId(3);              //
        m2.setHourRate(10);       // \___ Добавиться в конец
        m2.setWorkTime(180);      // /
        m2.setMonthTime(168);     //

        List<Employee> firstEmployeeList = new ArrayList<>();
        firstEmployeeList.add(p1); // id = 1
        firstEmployeeList.add(p2); // id = 2

        List<Employee> secondEmployeeList = new ArrayList<>();
        secondEmployeeList.add(m1); // id = 2
        secondEmployeeList.add(m2); // id = 3

        List<Employee> merge = Merge.merge(firstEmployeeList, secondEmployeeList);

        System.out.println(merge);
        List<Employee> needList = new ArrayList<>();
        needList.add(m1); // id = 2
        needList.add(m2); // id = 3
        System.out.println(needList);

        boolean result = false;
        for (Employee employee : needList) {
            for (Employee value : merge) {
                result = employee.equals(value);    // hashCode вычесляеться исходя от полей класса (каждый сотрудник уникален)
            }
        }

        if (merge.size() != needList.size()) {
            result = false;
        }

        Assert.assertTrue(result);
    }

}
