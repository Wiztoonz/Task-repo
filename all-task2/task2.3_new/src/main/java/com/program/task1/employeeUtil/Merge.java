package com.program.task1.employeeUtil;

import com.program.task1.model.Employee;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Merge {

    public static List<Employee> merge(List<Employee> firstList, List<Employee> secondList) {
        firstList.retainAll(secondList);

        Set<Employee> setEmployee = new LinkedHashSet<>(secondList);
        setEmployee.addAll(firstList);

        secondList.clear();
        secondList.addAll(setEmployee);

        if (firstList.isEmpty()) {
            firstList.addAll(secondList);
        } else {
            ListIterator<Employee> firstListIter = firstList.listIterator();
            for (Employee employee : secondList) {
                while (firstListIter.hasNext()) {
                    Employee next = firstListIter.next();
                    if (!firstList.contains(employee)) {
                        firstListIter.add(employee);
                    } else {
                        if (next.equals(employee)) {
                            next.setMonthTime(employee.getMonthTime());
                            next.setHourRate(employee.getHourRate());
                            next.setWorkTime(employee.getWorkTime());
                        }
                    }
                }
                firstListIter = firstList.listIterator();
            }
        }

        return firstList;
    }

}