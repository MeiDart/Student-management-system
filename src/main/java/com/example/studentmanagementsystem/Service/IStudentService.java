package com.example.studentmanagementsystem.Service;

import com.example.studentmanagementsystem.Entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudents();
    Student addNewStudent();

}
