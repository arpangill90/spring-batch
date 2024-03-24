package com.arpan.springbatch.config;

import com.arpan.springbatch.data.entity.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        //any transformation would go here, for now keeping it simple
        return employee;
    }
}
