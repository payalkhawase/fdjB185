package com.app.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.app.exception.userNotFoundException;
import com.app.model.Student;
import com.app.servicei.StudentServiceI;

@RestController 
public class HomeController { 

	@Autowired
	StudentServiceI ssi; 
	
	private static final Logger LOGGER= LoggerFactory.getLogger(HomeController.class);
	  
	@DeleteMapping("/remove/{rollno}")
	public ResponseEntity<Student> deleteStudent(@PathVariable ("rollno") int rollno){
		
		Student stu= ssi.deleteStudent(rollno);
		return new ResponseEntity<Student>(stu, HttpStatus.ACCEPTED);
	}
		

	@GetMapping("/get/{rollno}")
	public ResponseEntity<Student> getStudent(@PathVariable ("rollno") int rollno ) throws userNotFoundException{
		
		LOGGER.info("Get all the student data");
		Student stus= ssi.getStudent(rollno);
		return new ResponseEntity<Student>(stus, HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/addData")
	public ResponseEntity<Student> addAllData(@RequestBody Student s){
		
		Student stu=ssi.saveAllData(s);
		System.out.println(stu);
		
		System.out.println();
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);

	}
    
    	@PutMapping("update/{rollno}")
	public ResponseEntity<Student> putMethodName(@PathVariable int rollno, @RequestBody Student per) {
		//TODO: process PUT request
    		
		Student so = ssi.updateData(rollno,per);
		return new ResponseEntity<Student>(so,HttpStatus.OK);
	}
    	
    	

}
