package com.kalana.rentacar.springpractical.service;

import com.kalana.rentacar.springpractical.model.Student;

import java.util.Optional;

public interface StudentService {
    public Student save(Student student);
    Student fetchStudentById(int id);
}
