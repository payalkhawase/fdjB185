package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.StudentRepository;
import com.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	StudentRepository sr;
}
