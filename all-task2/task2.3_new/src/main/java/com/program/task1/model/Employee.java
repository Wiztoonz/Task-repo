package com.program.task1.model;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.monthTime, monthTime) == 0 &&
                Double.compare(employee.hourRate, hourRate) == 0 &&
                Double.compare(employee.workTime, workTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(monthTime, hourRate, workTime);
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