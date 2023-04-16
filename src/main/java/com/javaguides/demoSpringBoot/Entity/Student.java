package com.javaguides.demoSpringBoot.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tble_Student")
public class Student {

    @Id
    @Column(name = "s_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;

    private String name;
    private String major;
    private String email;

    public Student(){

    }

    public Student(String name,String major,String email) {
        this.name = name;
        this.major = major;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
