package com.javaguides.demoSpringBoot.Service;

import com.javaguides.demoSpringBoot.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentByID(int studentId);

    Student addStudent(Student student);

    Student updateStudent(Student student);

    String deleteStudentById(int studentID);
}
