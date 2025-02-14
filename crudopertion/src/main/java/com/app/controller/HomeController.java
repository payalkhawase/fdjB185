package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.servicei.StudentServiceI;

@RestController
public class HomeController {

	@Autowired
	StudentServiceI ssi;
	
	@PostMapping("/addData")
	public ResponseEntity<Student> addAllData(@RequestBody Student s){
		
		Student stu=ssi.saveAllData(s);
		
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);
	}
	
}
