package com.program.task1.task2_3;

import com.program.task1.model.Employee;

import java.util.List;

public class Merge {

    public static List<Employee> merge(List<Employee> firstList, List<Employee> secondList) {
        firstList.removeAll(secondList);
        firstList.addAll(secondList);
        return firstList;
    }

}
