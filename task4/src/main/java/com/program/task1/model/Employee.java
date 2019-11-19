package com.program.task1.model;

import com.program.task1.logic.EmployeeCalc;

import java.util.Objects;

public abstract class Employee {

    protected final int MONTH_WORK_TIME = 168;
    protected final int WORK_CALENDAR = 21;
    protected final int WEEK_WORK_TIME = 8;
    protected final int PERCENT = 100;

    private int id;
    private String name;
    private double time;
    private double rate;
    private String status;

    public Employee() {
    }

    public Employee(String name, double time, double rate, String status) {
        this.name = name;
        this.time = time;
        this.rate = rate;
        this.status = status;
    }

    public abstract double monthSalary();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setHour(double time) {
        this.time = time;
    }

    // Вычесляет с 100% з/п ставку за час
    public void setRate(double salary) {
        rate = EmployeeCalc.rate(salary, MONTH_WORK_TIME);
    }

    public double getTimePercent() {
        return EmployeeCalc.time(time, MONTH_WORK_TIME, PERCENT);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getRate() {
        return rate;
    }

    public double getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return MONTH_WORK_TIME == employee.MONTH_WORK_TIME &&
                WORK_CALENDAR == employee.WORK_CALENDAR &&
                WEEK_WORK_TIME == employee.WEEK_WORK_TIME &&
                PERCENT == employee.PERCENT &&
                id == employee.id &&
                Double.compare(employee.time, time) == 0 &&
                Double.compare(employee.rate, rate) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(status, employee.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MONTH_WORK_TIME, WORK_CALENDAR, WEEK_WORK_TIME, PERCENT, id, name, time, rate, status);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", rate=" + rate +
                ", status='" + status + '\'' +
                '}';
    }

}