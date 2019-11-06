package com.program.task1.model;

public class Programmer extends Employee {

    @Override
    public double monthSalary() {
        double rate = getRate();
        double time = getTime();
        double salary = rate * MONTH_WORK_TIME;
        double worked = time / WEEK_WORK_TIME;
        return salary / WORK_CALENDAR * worked;
    }

}
