package com.program.task1;

import com.program.task1.model.EmployeeImpl;
import com.program.task1.service.Accountant;
import com.program.task1.service.Manager;
import com.program.task1.service.Programmer;

import java.util.ArrayList;
import java.util.List;

// Рабочая неделя 8 часов
// Рабочих дней за месяц 21 день
// Рабочих часов за месяц 168 = 100%
// Из 100% зарплаты за месяц находиться з/п за час
// Программист получает з/п за отработанное время
// Менеджер получает з/п за отработанное время или же если перерабатывает то фиксированую ставку

// Есть возможность контролировать время: рабочей недели, месяца, календарные дни и отработанное время. (при создании сотрудника)
// Ращет зарплаты за месяц будет зависит от этих данных.
// Время за месяц учитываеться как 100% отработки.

public class App {

    public static void main(String[] args) {

        System.out.println("Programmers: ");

        // Отработал все часы

        // Создаем сотрудника программист
        EmployeeImpl p1 = new Programmer(8, 168, 21, 168);
        // Устанавливаем ожидаемую зп за месец (будет вычеслен рейт за час)
        p1.setRate(1000);
        // Установка времени отработаного за месяц если нужно изменить
//        p1.setHour(168);
        // Вывод отработаных часов в процентах
        System.out.println("Work percent " + (int) p1.getTimePercent() + "%");
        // Вывод з/п за месяц за 8 часовой день, 168 часов за месяц и 21 календарный день
        System.out.println("Salary: " + (int) p1.monthSalary());

        System.out.println("----");

        // Отработал меньше
        EmployeeImpl p2 = new Programmer(8, 168, 21, 160);
        p2.setRate(1000);
        System.out.println("Work percent " + (int) p2.getTimePercent() + "%");
        System.out.println("Salary: " + (int) p2.monthSalary());

        System.out.println("----");

        // Переработал
        EmployeeImpl p3 = new Programmer(8, 168, 21, 181);
        p3.setRate(500);
        System.out.println("Work percent " + (int) p3.getTimePercent() + "%");
        System.out.println("Salary: " + (int) p3.monthSalary());

        System.out.println("****");

        System.out.println("Manager: ");

        // Отработал все часы
        EmployeeImpl m1 = new Manager(8, 168, 21, 168);
        m1.setRate(800);
        System.out.println("Work percent " + (int) m1.getTimePercent() + "%");
        System.out.println("Salary: " + (int) m1.monthSalary());

        System.out.println("----");

        // Отработал меньше
        EmployeeImpl m2 = new Manager(8, 168, 21, 160);
        m2.setRate(1200);
        System.out.println("Work percent " + (int) m2.getTimePercent() + "%");
        System.out.println("Salary: " + (int) m2.monthSalary());

        System.out.println("----");

        // Переработал
        EmployeeImpl m3 = new Manager(8, 168, 21, 174);
        m3.setRate(1000);
        System.out.println("Work percent " + (int) m3.getTimePercent() + "%");
        System.out.println("Salary: " + (int) m3.monthSalary());

        System.out.println("****");

        System.out.println("Accountant: ");

        List<EmployeeImpl> employeeImplList = new ArrayList<>();
        employeeImplList.add(p1);
        employeeImplList.add(p2);
        employeeImplList.add(p3);
        employeeImplList.add(m1);
        employeeImplList.add(m2);
        employeeImplList.add(m3);

        Accountant accountant = new Accountant();

        // Вычислить з/п всех сотрудников (суммарно)
        double amount = accountant.amount(employeeImplList);

        System.out.println("Salary of all employees per month: " + (int) amount);
    }

}
