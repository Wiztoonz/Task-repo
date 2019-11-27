package com.program.task1.model;

public abstract class Employee {

    protected final int PERCENT = 100;

    private double monthTime;
    private double hourRate;
    private double workTime;

    public abstract long monthSalary();

    public long timePercent() {
        return Math.round(workTime / monthTime * PERCENT);
    }

    public double getMonthTime() {
        return monthTime;
    }

    public void setMonthTime(double monthTime) {
        this.monthTime = monthTime;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "monthTime=" + monthTime +
                ", hourRate=" + hourRate +
                ", workTime=" + workTime +
                '}';
    }

}