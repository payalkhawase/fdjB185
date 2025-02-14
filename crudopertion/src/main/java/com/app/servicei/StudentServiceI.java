package com.app.servicei;

import com.app.model.Student;

public interface StudentServiceI {
	
	public Student getStudent(int rollno);

	public Student updateData(int rollno, Student per);


	public Student deleteStudent(int rollno);

	public Student deleteStudent(int rollno);


	public Student saveAllData(Student s);

}
