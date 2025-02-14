package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.servicei.StudentServiceI;

@RestController
public class HomeController {

	@Autowired
	StudentServiceI ssi;
}
