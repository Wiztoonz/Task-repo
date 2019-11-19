package com.program.task1.config;

import com.program.task1.dto.EmployeeDto;
import com.program.task1.logic.Manager;
import com.program.task1.logic.Programmer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.program.task1"})
public class AppConfig {

    @Bean
    public Programmer programmer() {
        return new Programmer();
    }

    @Bean
    public Manager manager() {
        return new Manager();
    }

    @Bean
    public EmployeeDto employeeDTO() {
        return new EmployeeDto(programmer(), manager());
    }

}
