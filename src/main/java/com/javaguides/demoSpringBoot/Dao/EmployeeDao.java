package com.javaguides.demoSpringBoot.Dao;

import com.javaguides.demoSpringBoot.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
