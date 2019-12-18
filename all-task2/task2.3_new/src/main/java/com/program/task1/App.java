package com.program.task1;

import com.program.task1.employeeUtil.Merge;
import com.program.task1.model.Accountant;
import com.program.task1.model.Employee;
import com.program.task1.model.Manager;
import com.program.task1.model.Programmer;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Employee p1 = new Programmer();
        p1.setId(1);
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);
        System.out.printf(p1 + " Время полной работы программиста в процентах: %d%%. З/П: %d.\n", p1.timePercent(), p1.monthSalary());

        Employee p2 = new Programmer();
        p2.setId(2);
        p2.setHourRate(10);
        p2.setWorkTime(168);
        p2.setMonthTime(170);
        System.out.printf(p2 + " Время переработки программиста в процентах: %d%%. З/П: %d.\n", p2.timePercent(), p2.monthSalary());

        Employee p3 = new Programmer();
        p3.setId(3);
        p3.setHourRate(10);
        p3.setWorkTime(150);
        p3.setMonthTime(180);
        System.out.printf(p3 + " Время недоработки программиста в процентах: %d%%. З/П: %d.\n", p3.timePercent(), p3.monthSalary());

        System.out.println();

        Employee m1 = new Manager();
        m1.setId(2);
        m1.setHourRate(10);
        m1.setWorkTime(168);
        m1.setMonthTime(170);
        System.out.printf(m1 + " Время полной работы менеджера в процентах: %d%%. З/П: %d.\n", m1.timePercent(), m1.monthSalary());

        Employee m2 = new Manager();
        m2.setId(3);
        m2.setHourRate(10);
        m2.setWorkTime(180);
        m2.setMonthTime(180);
        System.out.printf(m2 + " Время переработки менеджера в процентах: %d%%. З/П: %d.\n", m2.timePercent(), m2.monthSalary());

        Employee m3 = new Manager();
        m3.setId(4);
        m3.setHourRate(157);
        m3.setWorkTime(60);
        m3.setMonthTime(70);
        System.out.printf(m3 + " Время недоработки менеджера в процентах: %d%%. З/П: %d.\n", m3.timePercent(), m3.monthSalary());

        Employee m4 = new Manager();
        m4.setId(5);
        m4.setHourRate(157);
        m4.setWorkTime(60);
        m4.setMonthTime(70);

        Employee m5 = new Manager();
        m5.setId(6);
        m5.setHourRate(157);
        m5.setWorkTime(60);
        m5.setMonthTime(70);

        System.out.println();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(p1);
        employeeList.add(p2);
        employeeList.add(p3);
        employeeList.add(m1);
        employeeList.add(m2);
        employeeList.add(m3);

        Accountant accountant = new Accountant();
        long amount = accountant.amount(employeeList);
        System.out.printf("Сумма выплат сотрудникам: %d\n", amount);

        List<Employee> firstEmployeeList = new ArrayList<>();
        firstEmployeeList.add(p1);
        firstEmployeeList.add(p2);
        firstEmployeeList.add(p3);

        List<Employee> secondEmployeeList = new ArrayList<>();
        secondEmployeeList.add(m1);
        secondEmployeeList.add(m2);
        secondEmployeeList.add(m3);
        secondEmployeeList.add(m4);
        secondEmployeeList.add(m5);

        System.out.println("After merge");
        List<Employee> merge = Merge.merge(firstEmployeeList, secondEmployeeList);
        System.out.println("merge: " + merge);
        System.out.println("A: " + firstEmployeeList);
        System.out.println("b: " + secondEmployeeList);
    }

}
