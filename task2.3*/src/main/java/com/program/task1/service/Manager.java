package com.program.task1.service;

import com.program.task1.model.Employee;

public class Manager extends Employee {

    private static int managerCounter;

    public Manager(String status) {
        if (!status.equals(Status.manager())) {
            throw new RuntimeException("This employee can be only manager");
        }
        managerCounter++;
        setStatus(status);
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

    public static int getManagerCounter() {
        return managerCounter;
    }

}
