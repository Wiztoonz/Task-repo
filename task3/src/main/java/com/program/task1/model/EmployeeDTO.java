package com.program.task1.model;

import java.util.Objects;

public class EmployeeDTO {

    private String name;
    private double time;
    private double monthSalary;
    private String status;

    public EmployeeDTO() {
    }

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDTO)) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return Double.compare(that.time, time) == 0 &&
                Double.compare(that.monthSalary, monthSalary) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time, monthSalary, status);
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", monthSalary=" + monthSalary +
                ", status='" + status + '\'' +
                '}';
    }
}
