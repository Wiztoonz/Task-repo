package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.staff.Accountant;
import com.program.task1.staff.Manager;
import com.program.task1.staff.Programmer;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Employee p1 = new Programmer();
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);
        System.out.printf(p1 + " Время полной работы программиста в процентах: %d%%. З/П: %d.\n",
                p1.timeWorked(), p1.monthSalary(p1.getHourRate(), p1.getWorkTime(), p1.getMonthTime()));

        Employee p2 = new Programmer();
        p2.setHourRate(10);
        p2.setWorkTime(173);
        p2.setMonthTime(168);
        System.out.printf(p2 + " Время переработки программиста в процентах: %d%%. З/П: %d.\n",
                p2.timeWorked(), p2.monthSalary(p2.getHourRate(), p2.getWorkTime(), p2.getMonthTime()));

        Employee p3 = new Programmer();
        p3.setHourRate(10);
        p3.setWorkTime(150);
        p3.setMonthTime(168);
        System.out.printf(p3 + " Время недоработки программиста в процентах: %d%%. З/П: %d.\n",
                p3.timeWorked(), p3.monthSalary(p3.getHourRate(), p3.getWorkTime(), p3.getMonthTime()));

        System.out.println();

        Employee m1 = new Manager();
        m1.setHourRate(10);
        m1.setWorkTime(168);
        m1.setMonthTime(168);
        System.out.printf(m1 + " Время полной работы менеджера в процентах: %d%%. З/П: %d.\n",
                m1.timeWorked(), m1.monthSalary(m1.getHourRate(), m1.getWorkTime(), m1.getMonthTime()));

        Employee m2 = new Manager();
        m2.setHourRate(10);
        m2.setWorkTime(180);
        m2.setMonthTime(168);
        System.out.printf(m2 + " Время переработки менеджера в процентах: %d%%. З/П: %d.\n",
                m2.timeWorked(), m2.monthSalary(m2.getHourRate(), m2.getWorkTime(), m2.getMonthTime()));

        Employee m3 = new Manager();
        m3.setHourRate(10);
        m3.setWorkTime(140);
        m3.setMonthTime(168);
        System.out.printf(m3 + " Время недоработки менеджера в процентах: %d%%. З/П: %d.\n",
                m3.timeWorked(), m3.monthSalary(m3.getHourRate(), m3.getWorkTime(), m3.getMonthTime()));

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
        System.out.printf("Сумма выплат сотрудникам: %d", amount);
    }

}
