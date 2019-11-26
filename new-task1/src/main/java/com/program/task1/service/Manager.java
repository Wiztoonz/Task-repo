package com.program.task1.service;

import com.program.task1.model.EmployeeImpl;

public class Manager extends EmployeeImpl {

    public Manager(int weekTime, double monthTime, int workDay, double workTime) {
        super(weekTime, monthTime, workDay, workTime);
    }

    public Manager(int weekTime, double monthTime, int workDay) {
        super(weekTime, monthTime, workDay);
    }

    @Override
    public double monthSalary() {
        double rate = getRate(), time = getTime();
        return (getTimePercent() >= PERCENT) ? (rate * time) : calcSalary(weekTime, workDay, rate, time);
    }

}
