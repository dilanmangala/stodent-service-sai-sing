package com.example.student.request;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;


public class StudentRequest {
	
	@NotBlank
	private String studentName;
	@NotBlank
	private String course;
	@NotNull
	private boolean isLanguageKnown;
	@NotBlank
	private String gender;
	@Past
	private Date dateOfBirth;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public boolean isLanguageKnown() {
		return isLanguageKnown;
	}
	public void setLanguageKnown(boolean isLanguageKnown) {
		this.isLanguageKnown = isLanguageKnown;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "StudentRequest [studentName=" + studentName + ", course=" + course + ", isLanguageKnown="
				+ isLanguageKnown + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
}
