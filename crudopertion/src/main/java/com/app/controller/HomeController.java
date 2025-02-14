package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.servicei.StudentServiceI;

@RestController
public class HomeController {

	@Autowired
	StudentServiceI ssi;
	
	@GetMapping("/getUser")
	public ResponseEntity<Student> getsingleuser(@PathVariable("rollno") int rollno)
	{
		Student s = ssi.getStudent(rollno);
		
		return new ResponseEntity<Student>(s, HttpStatus.ACCEPTED);
	}
} 
