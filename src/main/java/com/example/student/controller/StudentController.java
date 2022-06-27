package com.example.student.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.request.StudentRequest;
import com.example.student.response.StudentResponse;
import com.example.student.service.StudentService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/student")
@CrossOrigin
public class StudentController {
	
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	StudentService studentService;

	@PostMapping(value = "/addStudent")
	public ResponseEntity<StudentResponse> addStudent(@Valid @RequestBody StudentRequest request) {
		ResponseEntity<StudentResponse> responseEntity = null;
		StudentResponse response = new StudentResponse();
		try {
			log.info("Student Request {}", request);
			log.info("start add student in controller for Student : {}", request.getStudentName());
			studentService.addStudent(request);
			response.setMessage("Success");
			responseEntity = ResponseEntity.status(HttpStatus.OK).body(response);
			
			log.info("end add student in controller for Student : {}", request.getStudentName());
		} catch (Exception e) {
			log.error("exception in add student in controller for Student : {}", request.getStudentName());
			response.setError("Failure");
			response.setRequest(request);
			responseEntity = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
		return responseEntity;
	}
	
}
