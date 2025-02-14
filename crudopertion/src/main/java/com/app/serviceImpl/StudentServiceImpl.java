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
	public Student updateData(int rollno, Student per) {
		// TODO Auto-generated method stub
		return sr.save(per);
	}
}
