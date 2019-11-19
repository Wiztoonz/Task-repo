package com.program.task1;

import com.program.task1.model.Employee;
import com.program.task1.service.CreateJson;
import com.program.task1.service.Programmer;
import com.program.task1.service.Status;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCreateJson {

    @Test
    public void testWriteJson() {
        Employee p1 = new Programmer();
        p1.setName("Sylvanas");
        p1.setRate(1000);
        p1.setHour(168);
        p1.setStatus(Status.programmer());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(p1);

        boolean result = CreateJson.writeJson("tst", employeeList);

        Assert.assertTrue(result);
    }

    @Test
    public void testReadJson() {
        Employee p1 = new Programmer();
        p1.setName("Sylvanas");
        p1.setRate(1000);
        p1.setHour(168);
        p1.setStatus(Status.programmer());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(p1);

        List<Employee> employees = CreateJson.readJson("tst");

        Assert.assertEquals(employeeList, employees);
    }
}
