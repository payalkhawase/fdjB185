package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{


	public Student getStudent(int rollno);

	//public Student deleteByRollno(int rollno);
}
