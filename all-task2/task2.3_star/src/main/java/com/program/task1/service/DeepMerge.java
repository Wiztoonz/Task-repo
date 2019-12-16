package com.program.task1.service;

import com.program.task1.model.Employee;

public class DeepMerge {

    public static Employee[] deepMerge(Employee[] programmers, Employee[] managers) {
        int size = programmers.length + managers.length;
        Employee[] merge = new Employee[size];

        for (int i = 0; i < size; i++) {
            if (programmers.length > i) {
                merge[i] = programmers[i];
            }
        }

        int startIndex = programmers.length;
        for (Employee manager : managers) {
            merge[startIndex++] = manager;
        }

        return merge;
    }

}
