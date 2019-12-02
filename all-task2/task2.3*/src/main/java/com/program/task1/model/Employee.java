package com.program.task1.model;

public abstract class Employee {

    protected final int MONTH_WORK_TIME = 168;
    protected final int WORK_CALENDAR = 21;
    protected final int WEEK_WORK_TIME = 8;
    protected final int PERCENT = 100;

    private Integer id;
    private double time;
    private double rate;
    private String name;
    private Address address;
    private String status;

    private static int EmployeeCounter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        EmployeeCounter++;
        this.id = id;
    }

    public void setHour(double time) {
        checkId();
        this.time = time;
    }

    // Вычесляет с 100% з/п ставку за час
    public void setRate(double salary) {
        checkId();
        rate = salary / MONTH_WORK_TIME;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkId();
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        checkId();
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    private void checkId() {
        if (id == null) {
            throw new RuntimeException("ID cannot be null");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", time=" + time +
                ", rate=" + rate +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", status='" + status + '\'' +
                '}';
    }
}