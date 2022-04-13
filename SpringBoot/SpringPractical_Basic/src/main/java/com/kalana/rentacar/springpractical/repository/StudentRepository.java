package com.kalana.rentacar.springpractical.repository;

import com.kalana.rentacar.springpractical.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
