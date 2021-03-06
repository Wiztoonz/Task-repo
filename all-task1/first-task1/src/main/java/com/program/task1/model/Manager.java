package com.program.task1.model;

public class Manager extends Employee {

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
