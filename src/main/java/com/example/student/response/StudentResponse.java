package com.example.student.response;

import com.example.student.request.StudentRequest;

public class StudentResponse {

	private String message;
	private String error;
	private StudentRequest request;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public StudentRequest getRequest() {
		return request;
	}
	public void setRequest(StudentRequest request) {
		this.request = request;
	}
	
	
}
