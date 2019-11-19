package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.service.CreateJson;
import com.program.task1.service.Manager;
import com.program.task1.service.Programmer;
import com.program.task1.service.Status;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Employee p1 = new Programmer();
        p1.setName("Sylvanas");
        p1.setRate(1000);
        p1.setHour(168);
        p1.setStatus(Status.programmer());

        Employee p2 = new Programmer();
        p2.setName("Alleria");
        p2.setRate(1000);
        p2.setHour(160);
        p2.setStatus(Status.programmer());

        Employee p3 = new Programmer();
        p3.setName("Vereesa");
        p3.setRate(500);
        p3.setHour(181);
        p3.setStatus(Status.programmer());

        Employee m1 = new Manager();
        m1.setName("Dath'Remar");
        m1.setRate(800);
        m1.setHour(168);
        m1.setStatus(Status.manager());

        Employee m2 = new Manager();
        m2.setName("Dar'Khan");
        m2.setRate(1200);
        m2.setHour(160);
        m2.setStatus(Status.manager());

        Employee m3 = new Manager();
        m3.setName("Lirath");
        m3.setRate(1000);
        m3.setHour(174);
        m3.setStatus(Status.manager());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(p1);
        employeeList.add(p2);
        employeeList.add(p3);
        employeeList.add(m1);
        employeeList.add(m2);
        employeeList.add(m3);

        CreateJson.writeJson("test", employeeList);
        List<Employee> employees = CreateJson.readJson("test");

        System.out.println(employees);
    }

}
