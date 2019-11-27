package com.program.task1.staff;

import com.program.task1.model.Employee;
import com.program.task1.service.EmployeeService;

public class Programmer extends Employee {

    @Override
    public long timeWorked() {
        return EmployeeService.percentWorked(getWorkTime(), getMonthTime());
    }

}
