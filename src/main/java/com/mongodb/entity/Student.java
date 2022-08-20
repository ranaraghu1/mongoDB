package com.mongodb.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.pojo.Department;
import com.mongodb.pojo.Subject;

@Document(collection="student")
public class Student {
	@Id
	private String id;
	@Field(name="name")
	private String name;
	@Field(name="mail")
	private String email;
	private Department department;
	private List<Subject> subjects;
	
	//When more than one constructor in Collection class
	//@PersistenceConstructor
	/*
	 * public Student(String id, String name, String email, Department department,
	 * List<Subject> subjects) { super(); this.id = id; this.name = name; this.email
	 * = email; this.department = department; this.subjects = subjects; }
	 * 
	 * public Student(String id, Department department) { super(); this.id = id;
	 * this.department = department; }
	 */


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	

}
