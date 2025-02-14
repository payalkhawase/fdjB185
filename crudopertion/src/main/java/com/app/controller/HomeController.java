package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.servicei.StudentServiceI;

@RestController
public class HomeController {

	@Autowired
	StudentServiceI ssi;
	
	@DeleteMapping("/remove/{rollno}")
	public ResponseEntity<Student> deleteStudent(@PathVariable ("rollno") int rollno){
		
		Student stu= ssi.deleteStudent(rollno);
		return new ResponseEntity<Student>(stu, HttpStatus.ACCEPTED);
		
		
	}
	
}
