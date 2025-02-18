package com.app.servicei;

import com.app.exception.userNotFoundException;
import com.app.model.Student;

public interface StudentServiceI {

	public Student updateData(int rollno, Student per); 

	 Student deleteStudent(int rollno);

	public Student saveAllData(Student s);

	public Student getStudent(int rollno) throws userNotFoundException;

	


}
