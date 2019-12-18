package com.program.task1.employeeUtil;

import com.program.task1.model.Employee;

import java.util.*;

public class Merge {

    public static List<Employee> merge(List<Employee> firstList, List<Employee> secondList) {
        List<Employee> copyFirstList = new ArrayList<>(firstList); // \___ из [A] удалить только те, которых нет в [B]
        copyFirstList.retainAll(secondList);                       // /    (делаю в копии чтоб не изменять [A])

        Set<Employee> set = new HashSet<>(secondList); //   \___ копия [A] в [B] и редактирование
        set.addAll(copyFirstList);                     //   /

        secondList.clear();                            // \___ перенос в [B] и получение индексации (не затрагивает [A])
        secondList.addAll(set);                        // /

        Iterator<Employee> iterator = secondList.iterator();
        int indexElement = 0;
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (indexElement < firstList.size()) {       // \___ Переливаем данные из [B] в [A]
                firstList.set(indexElement, employee);   // /
            } else {                        // \___ Когда данные перелиты и в [B] остались данные, тогда просто дополнить [A].
                firstList.add(employee);    // /
            }
            indexElement++;
        }
        return firstList; // На данные момент [A] == [B]
    }

}
