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
    private Employee m3;

    @Before
    public void init() {
        p1 = new Programmer();
        p2 = new Programmer();
        m1 = new Manager();
        m2 = new Manager();
        m3 = new Manager();
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

        System.out.println(merge + " m");
        List<Employee> needList = new ArrayList<>();
        needList.add(m1); // id = 2
        needList.add(m2); // id = 3
        System.out.println(needList + " n");

        boolean result = false;
        for (Employee employee : needList) {
            for (Employee value : merge) {
                result = employee.equals(value);    // hashCode вычесляеться исходя от id (каждый сотрудник уникален)
            }
        }

        if (merge.size() != needList.size()) {
            result = false;
        }

        Assert.assertTrue(result);
    }

    @Test
    public void testMergeMethod1() {
        p1.setId(1);                //
        p1.setHourRate(10);         //  \___  удалиться
        p1.setWorkTime(168);        //  /
        p1.setMonthTime(168);       //

        p2.setId(2);                //
        p2.setHourRate(10);         // \_____ будет заменена
        p2.setWorkTime(173);        // /
        p2.setMonthTime(168);       //

        m1.setId(2);              //                                                                        p  2
        m1.setHourRate(10);       //  \____  при создании если будет ще id 2 тогда этого просто не будет    m  2 3 4
        m1.setWorkTime(100);      //  /
        m1.setMonthTime(168);     //

        m2.setId(3);              //
        m2.setHourRate(10);       // \___ в конец
        m2.setWorkTime(180);      // /
        m2.setMonthTime(168);     //

        m3.setId(4);              //
        m3.setHourRate(10);       // \___ удалится
        m3.setWorkTime(100);      // /
        m3.setMonthTime(100);     //

        List<Employee> firstEmployeeList = new ArrayList<>();
        firstEmployeeList.add(p1); // удалиться p1 id = 1
        firstEmployeeList.add(p2); // будет заменена p2 id = 2
        firstEmployeeList.add(m3); // удалится m3 id = 4

        List<Employee> secondEmployeeList = new ArrayList<>();
        secondEmployeeList.add(m2); // добавится id = 3
        secondEmployeeList.add(m1); // id = 2 так как в списке есть еще элемент с id = 2  этот просто перезапишеться
        secondEmployeeList.add(p2); // заменит id 2 с первого листа

        List<Employee> merge = Merge.merge(firstEmployeeList, secondEmployeeList);

        List<Employee> needList = new ArrayList<>();
        needList.add(p2); // id = 3
        needList.add(m2); // id = 2
        System.out.println(merge + " m");
        System.out.println(needList + " n");

        boolean result = false;
        for (Employee employee : needList) {
            for (Employee value : merge) {
                result = employee.equals(value); // hashCode вычесляеться исходя от id (каждый сотрудник уникален)
            }
        }

        if (merge.size() != needList.size()) {
            result = false;
        }

        Assert.assertTrue(result);
    }

}
