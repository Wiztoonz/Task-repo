package com.program.task1.employeeUtil;

import com.program.task1.model.Employee;

import java.util.*;

public class Merge {

    public static List<Employee> merge(List<Employee> firstList, List<Employee> secondList) {
        secondList.removeAll(firstList);
        secondList.addAll(firstList);

        List<Employee> secondListCopy = new ArrayList<>(secondList);

        secondList.removeAll(firstList);
        firstList.addAll(secondList);

        List<Employee> firstListCopy = new ArrayList<>(firstList);

        firstList.clear();
        secondList.clear();

        Collections.sort(secondListCopy);
        Collections.sort(firstListCopy);

        firstList.addAll(secondListCopy);
        secondList.addAll(firstListCopy);
        return firstList;
    }

}
