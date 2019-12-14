package com.program.task1.EmployeeUtil;

import com.program.task1.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Merge {

    public static List<Employee> merge(List<Employee> firstList, List<Employee> secondList) {
        List<Employee> firstListCopy = new ArrayList<>(firstList);
        firstListCopy.removeAll(secondList);
        firstListCopy.addAll(secondList);
        return firstListCopy;
    }

}
