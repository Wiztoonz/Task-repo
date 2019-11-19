package com.program.task1.logic;

import com.program.task1.model.Employee;

public class Manager extends Employee {

    public Manager() {
    }

    public Manager(String name, double time, double rate, String status) {
        super(name, time, rate, status);
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
