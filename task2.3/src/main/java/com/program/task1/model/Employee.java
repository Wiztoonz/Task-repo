package com.program.task1.model;

import java.util.Objects;

public abstract class Employee {

    protected final int MONTH_WORK_TIME = 168;
    protected final int WORK_CALENDAR = 21;
    protected final int WEEK_WORK_TIME = 8;
    protected final int PERCENT = 100;

    private int id;
    private String name;
    private String status;
    private double time;
    private double rate;

    public Employee() {
    }

    public Employee(int id, String name, String status, double time, double rate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.time = time;
        this.rate = rate;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", time=" + time +
                ", rate=" + rate +
                '}';
    }
}