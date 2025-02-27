package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	StudentRepository sr;

	@Override
	public Student getStudent(int rollno) {
	Student st=  sr.getStudent(rollno);
		return st;
	}
 
	@Override
	public Student updateData(int rollno, Student per) {
		// TODO Auto-generated method stub
		return sr.save(per);
	}

	@Override

	public Student deleteStudent(int rollno) {
		//sr.deleteByRollno(rollno);
		sr.deleteById(rollno);
		System.out.println("user deleted");
		return null;

	}
		
	public Student saveAllData(Student s) {
		
		Student st=sr.save(s);
		return st;

	}
}
