package com.program.task1.service;

import com.program.task1.model.Employee;

public class Programmer extends Employee {

    private static int programmerCounter;

    public Programmer(String status) {
        if (!status.equals(Status.programmer())) {
            throw new RuntimeException("This employee can be only programmer");
        }
        programmerCounter++;
        setStatus(status);
    }

    @Override
    public double monthSalary() {
        double rate = getRate();
        double time = getTime();
        double salary = rate * MONTH_WORK_TIME;
        double worked = time / WEEK_WORK_TIME;
        return salary / WORK_CALENDAR * worked;
    }

    public static int getProgrammerCounter() {
        return programmerCounter;
    }

}
