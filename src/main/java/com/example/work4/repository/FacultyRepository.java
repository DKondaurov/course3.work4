package com.example.work4.repository;

import com.example.work4.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findFacultyByColorIgnoreCaseOrNameIgnoreCase(String color, String name);

}