package com.program.task1.employeeUtil;

import com.program.task1.model.Employee;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Merge {

    public static List<Employee> merge(List<Employee> firstList, List<Employee> secondList) {
        firstList.retainAll(secondList);                       // из [A] удалить элементы которых нет в [B]

        Set<Employee> set = new LinkedHashSet<>(secondList);   //   \___ копия [A] в [B] и редактирование
        set.addAll(firstList);                                 //   /

        secondList.clear();                            // \___ перенос в [B] (не затрагивает [A])
        secondList.addAll(set);                        // /

        ListIterator<Employee> firstListIter = firstList.listIterator();
        ListIterator<Employee> secondListIter = secondList.listIterator();

        while (firstListIter.hasNext()) {
            Employee employeeFL = firstListIter.next();
            while (secondListIter.hasNext()) {
                Employee employeeSL = secondListIter.next();
                if (employeeFL.equals(employeeSL)) { // Если данные в [B] и [A] равны или неравны (так как в любом случае)
                    firstListIter.set(employeeSL);   // данные должны быть обновлены ничего не теряем. (есть минус на выполнение    |
                } else {                             // equals() сравнивает по id                      |лишней операции но только   |
                    firstListIter.add(employeeSL);   // Переливаем из [B] в [A] недостающие элементы.  |в том случае если           |
                }                                    //                                                |все поля полностью идентичны)
            }                                        //                                                 equals не можете проверить все поля
        }

        return firstList; // На данный момент [A] == [B]
    }

}
