package com.javaguides.demoSpringBoot.Service;

import com.javaguides.demoSpringBoot.Dao.EmployeeDao;
import com.javaguides.demoSpringBoot.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

     @Autowired
     private EmployeeDao employeeDao;


    @Override
    public List<Employee> getAllEmployee() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeByID(int employeeId) {
        Optional<Employee> e = this.employeeDao.findById(employeeId);
        Employee employee =null;
        if(e.isPresent()){
            employee =e.get();
        }
        else{
            throw new RuntimeException("Employee  not found for id: " + employeeId);
        }
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public String deleteEmployeeById(int employeeID) {
        this.employeeDao.deleteById(employeeID);
        return "Deleted Succesfully.";
    }
}
