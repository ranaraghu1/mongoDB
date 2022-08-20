package com.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.entity.Student;
import com.mongodb.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student getStudentById(String id) {
		return studentRepository.findById(id).get();
		
	}
	
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
		
	}
}
