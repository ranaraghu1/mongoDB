package com.mongodb.pojo;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;


public class Subject {
	
@Field(name="subject_name")	
private String subjectName;
@Field(name="marks_obtained")	
private String marks;
public String getSubjectName() {
	return subjectName;
}
public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks = marks;
}

}
