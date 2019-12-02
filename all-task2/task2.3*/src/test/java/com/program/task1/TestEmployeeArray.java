package com.program.task1;

import com.program.task1.model.Address;
import com.program.task1.model.Employee;
import com.program.task1.service.EmployeeArray;
import com.program.task1.service.Manager;
import com.program.task1.service.Programmer;
import com.program.task1.service.Status;
import org.junit.Assert;
import org.junit.Test;

public class TestEmployeeArray {

    @Test
    public void testCreateProgrammerArray() {
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

        Employee[] checkArray = new Employee[3];
        checkArray[0] = p1;
        checkArray[1] = p2;
        checkArray[2] = p3;

        EmployeeArray employeeArray = new EmployeeArray();
        employeeArray.createProgrammerArray(p1);
        employeeArray.createProgrammerArray(p2);
        employeeArray.createProgrammerArray(p3);

        Employee[] programmerArray = employeeArray.getProgrammerArray();

        Assert.assertArrayEquals(checkArray, programmerArray);
    }

    @Test
    public void testCreateManagerArray() {

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

        Employee[] checkArray = new Employee[3];
        checkArray[0] = m1;
        checkArray[1] = m2;
        checkArray[2] = m3;

        EmployeeArray mArray = new EmployeeArray();
        mArray.createManagerArray(m1);
        mArray.createManagerArray(m2);
        mArray.createManagerArray(m3);
        Employee[] managerArray = mArray.getManagerArray();

        Assert.assertArrayEquals(checkArray, managerArray);
    }

    @Test
    public void testCreateArrayWithoutDuplicate() {
        // Проверка на дубликат производиться с использованием идентификатора сотрудника.
        // Если последняя запись имеет один и тот же идентификатор тогда данные этой записи перезапишут предыдущую.

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
        p2.setId(1);
        p2.setRate(1000);
        p2.setHour(168);
        p2.setName("XXX");
        Address addressP2 = new Address();
        addressP2.setStreet("YYY");
        addressP2.setNumberHome(31);
        p2.setAddress(addressP2);

        Employee[] checkArray = new Employee[1];
        checkArray[0] = p2;

        EmployeeArray employeeArray = new EmployeeArray();
        employeeArray.createProgrammerArray(p1);
        employeeArray.createProgrammerArray(p2);

        Employee[] programmerArray = employeeArray.getProgrammerArray();

        Assert.assertArrayEquals(checkArray, programmerArray);
    }

}
