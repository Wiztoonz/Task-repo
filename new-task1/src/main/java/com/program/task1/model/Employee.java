package com.program.task1.model;

public interface Employee {

    int PERCENT = 100;

    default double monthSalary() { return 0; }

}
