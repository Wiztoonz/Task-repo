package com.program.task1.model;

import com.program.task1.service.SalaryCalc;

public abstract class EmployeeImpl extends SalaryCalc implements Employee {

    private double time;
    private double rate;

    protected int weekTime;
    protected double monthTime;
    protected int workDay;

    public EmployeeImpl(int weekTime, double monthTime, int workDay, double workTime) {
        this.weekTime = weekTime;
        this.monthTime = monthTime;
        this.workDay = workDay;
        this.time = workTime;
    }

    public void setHour(double time) {
        this.time = time;
    }

    // Вычесляет с 100% з/п ставку за час
    public void setRate(double salary) {
        rate = salary / monthTime;
    }

    public double getTimePercent() {
        return time / monthTime * PERCENT;
    }

    public abstract double monthSalary();

    protected double getRate() {
        return rate;
    }

    protected double getTime() {
        return time;
    }

}