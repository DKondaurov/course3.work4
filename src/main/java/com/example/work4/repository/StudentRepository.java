package com.example.work4.repository;

import com.example.work4.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findStudentByAge(int age);

    Collection<Student> findByAgeBetween(int man, int max);
}
