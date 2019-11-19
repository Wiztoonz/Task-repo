package com.program.task1.logic;

public class EmployeeCalc {

    public static double rate(double salary, int monthWorkTime) {
        return salary / monthWorkTime;
    }

    public static double time(double time, int monthWorkTime, double percent) {
        return time / monthWorkTime * percent;
    }

}
