package com.program.task1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public abstract class Employee {

    protected final int MONTH_WORK_TIME = 168;
    protected final int WORK_CALENDAR = 21;
    protected final int WEEK_WORK_TIME = 8;
    protected final int PERCENT = 100;

    public Employee() {
    }

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "time")
    private double time;

    @JsonIgnore
    private double rate;

    @JsonProperty(value = "status")
    private String status;

    @JsonProperty(value = "monthSalary")
    public abstract double monthSalary();

    public void setHour(double time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Вычесляет с 100% з/п ставку за час
    public void setRate(double salary) {
        rate = salary / MONTH_WORK_TIME;
    }

    @JsonIgnore
    public double getTimePercent() {
        return time / MONTH_WORK_TIME * PERCENT;
    }

    protected double getRate() {
        return rate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    protected double getTime() {
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
                Double.compare(employee.time, time) == 0 &&
                Double.compare(employee.rate, rate) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(status, employee.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MONTH_WORK_TIME, WORK_CALENDAR, WEEK_WORK_TIME, PERCENT, name, time, rate, status);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", rate=" + rate +
                '}';
    }
}