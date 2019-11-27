package com.program.task1.model;

public class Manager extends Employee {

    @Override
    public long monthSalary() {
        double monthTime = getMonthTime();
        double hourRate = getHourRate();
        long salary = Math.round(((hourRate * monthTime) / monthTime) * getWorkTime());
        return (timePercent() > PERCENT) ? Math.round(hourRate * monthTime) : salary;
    }

}
