package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
		

	@PostMapping("/addData")
	public ResponseEntity<Student> addAllData(@RequestBody Student s){
		
		Student stu=ssi.saveAllData(s);
		System.out.println(stu);
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);

	}
    
    	@PutMapping("update/{rollno}")
	public ResponseEntity<Student> putMethodName(@PathVariable int rollno, @RequestBody Student per) {
		//TODO: process PUT request
		Student so = ssi.updateData(rollno,per);
		
		return new ResponseEntity<Student>(so,HttpStatus.OK);
	}

}
