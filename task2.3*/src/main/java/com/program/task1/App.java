package com.program.task1;

import com.program.task1.model.Address;
import com.program.task1.model.Employee;
import com.program.task1.service.*;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Employee p1 = new Programmer(Status.programmer());
        p1.setId(1);
        p1.setRate(1000);
        p1.setHour(168);
        p1.setName("Archimonde");
        Address addressP1 = new Address();
        addressP1.setStreet("Bluff Road");
        addressP1.setNumberHome(31);
        p1.setAddress(addressP1);

        Employee p2 = new Programmer(Status.programmer());
        p2.setId(2);
        p2.setRate(1000);
        p2.setHour(160);
        p2.setName("Kil'jaeden");
        Address addressP2 = new Address();
        addressP2.setStreet("Wädenswil");
        addressP2.setNumberHome(42);
        p2.setAddress(addressP2);

        Employee p3 = new Programmer(Status.programmer());
        p3.setId(3);
        p3.setRate(500);
        p3.setHour(181);
        p3.setName("Mannoroth");
        Address addressP3 = new Address();
        addressP3.setStreet("Pacific");
        addressP3.setNumberHome(24);
        p3.setAddress(addressP3);


        Employee m1 = new Manager(Status.manager());
        m1.setId(1);
        m1.setRate(800);
        m1.setHour(168);
        m1.setName("Ner'zhul");
        Address addressM1 = new Address();
        addressM1.setStreet("Píla");
        addressM1.setNumberHome(23);
        m1.setAddress(addressM1);

        Employee m2 = new Manager(Status.manager());
        m2.setId(2);
        m2.setRate(1200);
        m2.setHour(160);
        m2.setName("Sargeras");
        Address addressM2 = new Address();
        addressM2.setStreet("Bremen");
        addressM2.setNumberHome(65);
        m2.setAddress(addressM2);

        Employee m3 = new Manager(Status.manager());
        m3.setId(3);
        m3.setRate(1000);
        m3.setHour(174);
        m3.setName("Balnazzar");
        Address addressM3 = new Address();
        addressM3.setStreet("Manzini");
        addressM3.setNumberHome(73);
        m3.setAddress(addressM3);


        EmployeeArray pArray = new EmployeeArray();
        pArray.createProgrammerArray(p1);
        pArray.createProgrammerArray(p2);
        pArray.createProgrammerArray(p3);
        Employee[] programmerArray = pArray.getProgrammerArray();

        System.out.println("Programmer array:");
        System.out.println(Arrays.toString(programmerArray));

        EmployeeArray mArray = new EmployeeArray();
        mArray.createManagerArray(m1);
        mArray.createManagerArray(m2);
        mArray.createManagerArray(m3);
        Employee[] managerArray = mArray.getManagerArray();

        System.out.println();
        System.out.println("Manager array:");
        System.out.println(Arrays.toString(managerArray));


        Employee[] mergeEmployee = DeepMerge.deepMerge(programmerArray, managerArray);

        System.out.println();
        System.out.println("Merge programmers with managers:");
        System.out.println(Arrays.toString(mergeEmployee));

    }

}
