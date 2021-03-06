package com.au.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.au.spring.model.Student;
import com.au.spring.service.impl.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/getName")
	public String getName() {
		return studentService.getName();
	}
	
	@PostMapping("/insert/studentDetails")
	public String insertStudentDetails(@RequestBody Student student)
	{
		return studentService.insertStudentDetails(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudentsRowMapper() {
		return studentService.getAllStudentsRowMapper();
	}
}
