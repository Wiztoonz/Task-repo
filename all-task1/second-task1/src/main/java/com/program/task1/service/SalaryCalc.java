package com.program.task1.service;

public class SalaryCalc {

    protected double calcSalary(int weekTime, int workDay, double rate, double time) {
        double salary = rate * time;
        double worked = time / weekTime;
        return salary / workDay * worked;
    }

}
