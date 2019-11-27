package com.program.task1.model;

public class Programmer extends Employee {

    @Override
    public long monthSalary() {
        double monthTime = getMonthTime();
        return Math.round(((getHourRate() * monthTime) / monthTime) * getWorkTime());
    }

}
