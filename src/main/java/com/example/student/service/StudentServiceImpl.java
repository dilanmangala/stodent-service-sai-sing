package com.example.student.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import com.example.student.request.StudentRequest;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void addStudent(StudentRequest request) {
		
		Student studentObj  = new Student();
		BeanUtils.copyProperties(request, studentObj);
		studentRepository.save(studentObj);
	}

}
