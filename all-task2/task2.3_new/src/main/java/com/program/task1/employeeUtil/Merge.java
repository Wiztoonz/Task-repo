package com.program.task1.employeeUtil;

import com.program.task1.model.Employee;

import java.util.*;

public class Merge {

    public static List<Employee> merge(List<Employee> firstList, List<Employee> secondList) {
        firstList.retainAll(secondList);

        secondList.addAll(firstList);
        List<Employee> listFormation = listFormation(secondList);

        secondList.clear();
        secondList.addAll(listFormation);

        ListIterator<Employee> firstListIter = firstList.listIterator();
        for (Employee nextSL : secondList) {
            while (firstListIter.hasNext()) {
                Employee nextFL = firstListIter.next();
                if (nextSL.equals(nextFL)) {
                    firstListIter.set(nextSL);
                } else {
                    firstListIter.add(nextSL);
                }
            }
            firstListIter = firstList.listIterator();
        }

        return firstList; // На данный момент [A] == [B]
    }

    private static List<Employee> listFormation(List<Employee> list) {
        Map<Employee, Integer> duplicates = new HashMap<>();
        for (Employee emp : list) {
            if (duplicates.containsKey(emp)) {
                duplicates.put(emp, duplicates.get(emp) + 1);
            } else {
                duplicates.put(emp, 1);
            }
        }

        for (Map.Entry<Employee, Integer> entry : duplicates.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            if (entry.getValue() > 2) {
                Collections.reverse(list);
                break;
            }
        }

        Set<Employee> employees = new LinkedHashSet<>(list);
        return new ArrayList<>(employees);
    }

}