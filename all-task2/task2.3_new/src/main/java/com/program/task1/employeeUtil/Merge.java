package com.program.task1.employeeUtil;

import com.program.task1.model.Employee;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Merge {

    public static List<Employee> merge(List<Employee> firstList, List<Employee> secondList) {
        firstList.retainAll(secondList);                       // из [A] удалить элементы которых нет в [B]

        Set<Employee> set = new LinkedHashSet<>(secondList);   //   \___ копия [A] в [B] и редактирование
        set.addAll(firstList);                                 //   /

        secondList.clear();                            // \___ перенос в [B] (не затрагивает [A])
        secondList.addAll(set);                        // /

        for (Employee employeeSL : secondList) {
            int index = secondList.indexOf(employeeSL);
            if (index < firstList.size()) {
                for (Employee employeeFL : firstList) {
                    if (!employeeSL.equals(employeeFL)) {      // \___ Переливаем данные из [B] в [A]
                        firstList.set(index, employeeSL);      // /    (если это нужно)
                    }
                }
            }
            if (firstList.size() < secondList.size()) {
                firstList.add(employeeSL); // Когда данные перелиты в [B] и остались данные, тогда просто дополнить [A].
            }
        }

        return firstList; // На данный момент [A] == [B]
    }

}
