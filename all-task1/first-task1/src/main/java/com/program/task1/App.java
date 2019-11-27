package com.program.task1;

import com.program.task1.model.Accountant;
import com.program.task1.model.Employee;
import com.program.task1.model.Manager;
import com.program.task1.model.Programmer;

import java.util.ArrayList;
import java.util.List;

// Рабочих дней за месяц 21
// Рабочих часов за месяц 168 = 100%
// Из 100% зарплаты за месяц находиться з/п за час
// Программист получает з/п за отработанное время
// Менеджер получает з/п за отработанное время или же если перерабатывает то фиксированую ставку

public class App {

    public static void main(String[] args) {

        System.out.println("Programmers: ");

        // Отработал все часы
        Employee p1 = new Programmer();
        p1.setRate(1000);
        p1.setHour(168);
        System.out.println("Work percent " + (int) p1.getTimePercent() + "%");
        System.out.println("Salary: " + (int) p1.monthSalary());

        System.out.println("----");

        // Отработал меньше
        Employee p2 = new Programmer();
        p2.setRate(1000);
        p2.setHour(160);
        System.out.println("Work percent " + (int) p2.getTimePercent() + "%");
        System.out.println("Salary: " + (int) p2.monthSalary());

        System.out.println("----");

        // Переработал
        Employee p3 = new Programmer();
        p3.setRate(500);
        p3.setHour(181);
        System.out.println("Work percent " + (int) p3.getTimePercent() + "%");
        System.out.println("Salary: " + (int) p3.monthSalary());

        System.out.println("****");

        System.out.println("Manager: ");

        // Отработал все часы
        Employee m1 = new Manager();
        m1.setRate(800);
        m1.setHour(168);
        System.out.println("Work percent " + (int) m1.getTimePercent() + "%");
        System.out.println("Salary: " + (int) m1.monthSalary());

        System.out.println("----");

        // Отработал меньше
        Employee m2 = new Manager();
        m2.setRate(1200);
        m2.setHour(160);
        System.out.println("Work percent " + (int) m2.getTimePercent() + "%");
        System.out.println("Salary: " + (int) m2.monthSalary());

        System.out.println("----");

        // Переработал
        Employee m3 = new Manager();
        m3.setRate(1000);
        m3.setHour(174);
        System.out.println("Work percent " + (int) m3.getTimePercent() + "%");
        System.out.println("Salary: " + (int) m3.monthSalary());

        System.out.println("****");

        System.out.println("Accountant: ");

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(p1);
        employeeList.add(p2);
        employeeList.add(p3);
        employeeList.add(m1);
        employeeList.add(m2);
        employeeList.add(m3);

        Accountant accountant = new Accountant();

        // Вычислить з/п всех сотрудников (суммарно)
        double amount = accountant.amount(employeeList);

        System.out.println("Salary of all employees per month: " + (int) amount);
    }

}
