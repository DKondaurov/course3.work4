package com.example.work4.service.impl;

import com.example.work4.model.Student;
import com.example.work4.repository.StudentRepository;
import com.example.work4.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void removeStudent(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Collection<Student> filterStudentByAge(int age) {
        return studentRepository.findStudentByAge(age);
    }

    @Override
    public Collection<Student> filterStudentsByAgeBetween(int min, int max) {
        return studentRepository.findByAgeBetween(min, max);
    }

}
