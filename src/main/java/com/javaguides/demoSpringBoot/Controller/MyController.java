package com.javaguides.demoSpringBoot.Controller;


import com.javaguides.demoSpringBoot.Entity.Employee;
import com.javaguides.demoSpringBoot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController //Controls the Rest Application.
public class MyController {

     @Autowired
     private EmployeeService employeeService;

     @GetMapping
     public String home(){
         return "<HTML><H1> Welcome to First Boot Application</H1></HTML>";
     }

     @GetMapping("/employees")
     public List<Employee> getEmployees(){
         return this.employeeService.getAllEmployee();
     }
     @GetMapping("/employees/{employeeID}")
     public Employee getEmployee(@PathVariable String employeeID){
         return this.employeeService.getEmployeeByID(Integer.parseInt(employeeID));
     }

     @PostMapping("/employees")
     public Employee addEmployee(@RequestBody Employee employee){
         return this.employeeService.addEmployee(employee);
     }

     @PutMapping("/employees")
     public Employee updateEmployee(@RequestBody Employee employee){
         return this.employeeService.updateEmployee(employee);
     }
     @DeleteMapping("/employee/{employeeID}")
     public String deleteEmployee(@PathVariable String employeeID){
         return this.employeeService.deleteEmployeeById(Integer.parseInt(employeeID));
     }

}
