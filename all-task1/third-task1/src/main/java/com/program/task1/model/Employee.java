package com.program.task1.model;

import com.program.task1.service.EmployeeService;

public abstract class Employee {

    private double hourRate;
    private double workTime;
    private double monthTime;

    public long monthSalary(double hourRate, double workTime, double monthTime) {
        return EmployeeService.payroll(hourRate, workTime, monthTime);
    }

    public abstract long timeWorked();

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

    public double getMonthTime() {
        return monthTime;
    }

    public void setMonthTime(double monthTime) {
        this.monthTime = monthTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hourRate=" + hourRate +
                ", workTime=" + workTime +
                ", monthTime=" + monthTime +
                '}';
    }

}