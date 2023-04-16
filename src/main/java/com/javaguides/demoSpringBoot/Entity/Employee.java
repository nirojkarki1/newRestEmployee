package com.javaguides.demoSpringBoot.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_Employee")
public class Employee {

     @Id
     @Column(name="E_id")
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int empid;

     private  String name;
     private String dept;
     private String address;

    public Employee() {
    }

    public Employee(String name,String dept,String address) {
        this.name = name;
        this.dept = dept;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
