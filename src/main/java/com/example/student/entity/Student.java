package com.example.student.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studentName;
	private String course;
	private boolean isLanguageKnown;
	private String gender;
	private Date dateOfBirth;
	
	public Student() {
		
	}
	
	public Student(String studentName, String course, boolean isLanguageKnown, String gender, Date dateOfBirth) {
		this.studentName = studentName;
		this.course = course;
		this.isLanguageKnown = isLanguageKnown;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
	
	
	

}
