package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
