package com.program.task1.logic;

import com.program.task1.model.Employee;

public class Programmer extends Employee {

    public Programmer() {
    }

    public Programmer(String name, double time, double rate, String status) {
        super(name, time, rate, status);
    }

    @Override
    public double monthSalary() {
        double rate = getRate();
        double time = getTime();
        double salary = rate * MONTH_WORK_TIME;
        double worked = time / WEEK_WORK_TIME;
        return salary / WORK_CALENDAR * worked;
    }

}
