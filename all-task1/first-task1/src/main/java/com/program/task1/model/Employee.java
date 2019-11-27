package com.program.task1.model;

public abstract class Employee {

    protected final int MONTH_WORK_TIME = 168;
    protected final int WORK_CALENDAR = 21;
    protected final int WEEK_WORK_TIME = 8;
    protected final int PERCENT = 100;

    private double time;
    private double rate;

    public void setHour(double time) {
        this.time = time;
    }

    // Вычесляет с 100% з/п ставку за час
    public void setRate(double salary) {
        rate = salary / MONTH_WORK_TIME;
    }

    public double getTimePercent() {
        return time / MONTH_WORK_TIME * PERCENT;
    }

    public abstract double monthSalary();

    protected double getRate() {
        return rate;
    }

    protected double getTime() {
        return time;
    }

}