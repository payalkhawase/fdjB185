package com.app.serviceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.userNotFoundException;
import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.servicei.StudentServiceI;


@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	StudentRepository sr;

	private static final Logger LOGGER =LoggerFactory.getLogger(StudentServiceImpl.class);
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

	@Override
	public Student getStudent(int rollno) throws userNotFoundException {
		Optional<Student> op= sr.findById(rollno);
		
		if(op.isPresent()) {
		Student stus= op.get();
		return stus;
		 
		}else {
			LOGGER.error("User not found");
			throw new userNotFoundException ("UserNotFoundException" +rollno);
			
		}
		
		
	}
}
