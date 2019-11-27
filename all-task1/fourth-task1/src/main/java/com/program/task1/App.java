package com.program.task1;

import com.program.task1.model.Accountant;
import com.program.task1.model.Employee;
import com.program.task1.model.Manager;
import com.program.task1.model.Programmer;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Employee p1 = new Programmer();
        p1.setHourRate(10);
        p1.setWorkTime(168);
        p1.setMonthTime(168);
        System.out.printf(p1 + " Время полной работы программиста в процентах: %d%%. З/П: %d.\n", p1.timePercent(), p1.monthSalary());

        Employee p2 = new Programmer();
        p2.setHourRate(10);
        p2.setWorkTime(173);
        p2.setMonthTime(168);
        System.out.printf(p2 + " Время переработки программиста в процентах: %d%%. З/П: %d.\n", p2.timePercent(), p2.monthSalary());

        Employee p3 = new Programmer();
        p3.setHourRate(10);
        p3.setWorkTime(150);
        p3.setMonthTime(168);
        System.out.printf(p3 + " Время недоработки программиста в процентах: %d%%. З/П: %d.\n", p3.timePercent(), p3.monthSalary());

        System.out.println();

        Employee m1 = new Manager();
        m1.setHourRate(10);
        m1.setWorkTime(168);
        m1.setMonthTime(168);
        System.out.printf(m1 + " Время полной работы менеджера в процентах: %d%%. З/П: %d.\n", m1.timePercent(), m1.monthSalary());

        Employee m2 = new Manager();
        m2.setHourRate(10);
        m2.setWorkTime(180);
        m2.setMonthTime(168);
        System.out.printf(m2 + " Время переработки менеджера в процентах: %d%%. З/П: %d.\n", m2.timePercent(), m2.monthSalary());

        Employee m3 = new Manager();
        m3.setHourRate(10);
        m3.setWorkTime(140);
        m3.setMonthTime(168);
        System.out.printf(m3 + " Время недоработки менеджера в процентах: %d%%. З/П: %d.\n", m3.timePercent(), m3.monthSalary());

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
