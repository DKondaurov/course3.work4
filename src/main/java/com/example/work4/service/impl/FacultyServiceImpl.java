package com.example.work4.service.impl;

import com.example.work4.model.Faculty;
import com.example.work4.repository.FacultyRepository;
import com.example.work4.service.FacultyService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    @Override
    public void removeFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Collection<Faculty> filterFacultyByColor(String color, String name) {
        return facultyRepository.findFacultyByColorIgnoreCaseOrNameIgnoreCase(color, name);
    }

}
