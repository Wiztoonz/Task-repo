package com.program.task1.staff;

import com.program.task1.model.Employee;
import com.program.task1.service.EmployeeService;

public class Manager extends Employee {

    @Override
    public long timeWorked() {
        double monthTime = getMonthTime();
        long percent = EmployeeService.percentWorked(getWorkTime(), monthTime);
        if (percent < 100) {
            return percent;
        }
        setWorkTime(monthTime);
        setMonthTime(monthTime);
        setHourRate(getHourRate());
        return percent;
    }

}
