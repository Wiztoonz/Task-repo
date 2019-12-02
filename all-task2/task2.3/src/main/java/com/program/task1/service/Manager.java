package com.program.task1.service;

import com.program.task1.model.Employee;

public class Manager extends Employee {

    public Manager() {
    }

    public Manager(int id, String name, String status, double time, double rate) {
        super(id, name, status, time, rate);
    }

    @Override
    public double monthSalary() {
        double timePercent = getTimePercent();
        double rate = getRate();
        double time = getTime();

        if (timePercent >= PERCENT) {
            return rate * MONTH_WORK_TIME;
        }

        double salary = rate * MONTH_WORK_TIME;
        double worked = time / WEEK_WORK_TIME;

        return salary / WORK_CALENDAR * worked;
    }

}
