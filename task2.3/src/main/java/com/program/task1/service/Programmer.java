package com.program.task1.service;

import com.program.task1.model.Employee;

public class Programmer extends Employee {

    public Programmer() {
    }

    public Programmer(int id, String name, String status, double time, double rate) {
        super(id, name, status, time, rate);
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
