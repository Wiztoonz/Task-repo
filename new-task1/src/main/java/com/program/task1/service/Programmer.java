package com.program.task1.service;

import com.program.task1.model.EmployeeImpl;

public class Programmer extends EmployeeImpl {

    public Programmer(int weekTime, double monthTime, int workDay, double workTime) {
        super(weekTime, monthTime, workDay, workTime);
    }

    @Override
    public double monthSalary() {
        double rate = getRate(), time = getTime();
        return calcSalary(weekTime, workDay, rate, time);
    }

}
