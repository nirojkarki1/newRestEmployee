package com.javaguides.demoSpringBoot.Service;

import com.javaguides.demoSpringBoot.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    Employee getEmployeeByID(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    String deleteEmployeeById(int employeeID);
}
