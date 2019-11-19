package com.program.task1;

import com.program.task1.config.AppConfig;
import com.program.task1.dto.EmployeeDto;
import com.program.task1.entity.EmployeeEntity;
import com.program.task1.logic.Status;
import com.program.task1.model.Employee;
import com.program.task1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class App {

    private EmployeeService employeeService;
    private EmployeeDto employeeDto;

    @Autowired
    public App(EmployeeService employeeService, EmployeeDto employeeDto) {
        this.employeeService = employeeService;
        this.employeeDto = employeeDto;
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        App app = context.getBean("app", App.class);
        // test save employee
        app.saveMethodTest();
        // test find one by id
        app.findMethodTest();
        // test update
        app.updateMethodTest();
        // test delete
        app.deleteMethodTest();

        // push data
        app.saveMethodTest();
        app.saveMethodTest();
        app.saveMethodTest();
        app.saveMethodTest();
        app.saveMethodTest();

        // test find all
        app.findAll();

    }

    private void saveMethodTest() {
        EmployeeEntity employee = new EmployeeEntity("Sargeras", 168, 1000, Status.programmer());
        employeeService.createEmployee(employee);
    }

    private void findMethodTest() {
        EmployeeEntity employee = employeeService.findEmployee(1);
        Employee emp = employeeDto.employeeEntityToEmployee(employee);
        System.out.println(emp);
        System.out.println("Отработано в %: " + emp.getTimePercent());
        System.out.println("ЗП за отработку: " + emp.monthSalary());
    }

    private void updateMethodTest() {
        EmployeeEntity employee = employeeService.findEmployee(1);
        employee.setName("XXX");
        employeeService.updateEmployee(employee, employee.getId());
        EmployeeEntity emp = employeeService.findEmployee(1);
        Employee employeeResult = employeeDto.employeeEntityToEmployee(emp);
        System.out.println(employeeResult);
        System.out.println("Отработано в %: " + employeeResult.getTimePercent());
        System.out.println("ЗП за отработку: " + employeeResult.monthSalary());
    }

    private void deleteMethodTest() {
        employeeService.deleteEmployee(1);
        EmployeeEntity employee = employeeService.findEmployee(1);
        if (employee == null) {
            System.out.println("DELETED");
        }
    }

    private void findAll() {
        List<EmployeeEntity> all = employeeService.findAll();
        List<Employee> employeeList = new ArrayList<>();
        for (EmployeeEntity employeeEntity : all) {
            employeeList.add(employeeDto.employeeEntityToEmployee(employeeEntity));
        }
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}
