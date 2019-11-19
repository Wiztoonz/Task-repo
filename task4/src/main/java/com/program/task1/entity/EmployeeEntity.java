package com.program.task1.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "time")
    private double time;
    @Column(name = "rate")
    private double rate;
    @Column(name = "status")
    private String status;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String name, double time, double rate, String status) {
        this.name = name;
        this.time = time;
        this.rate = rate;
        this.status = status;
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

    public double getTime() {
        return time;
    }

    public void setHour(double time) {
        this.time = time;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeEntity)) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return id == that.id &&
                Double.compare(that.time, time) == 0 &&
                Double.compare(that.rate, rate) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, time, rate, status);
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", rate=" + rate +
                ", status='" + status + '\'' +
                '}';
    }
}
