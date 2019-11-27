package com.program.task1.service;

public class EmployeeService {

    public static long payroll(double hourRate, double workTime, double monthTime) {
        return round(((hourRate * monthTime) / monthTime) * workTime);
    }

    public static long percentWorked(double workTime, double monthTime) {
        return round(workTime / monthTime * 100);
    }

    private static long round(double num) {
        return Math.round(num);
    }

}
