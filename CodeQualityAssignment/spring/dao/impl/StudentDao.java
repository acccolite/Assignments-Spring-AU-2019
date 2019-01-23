package com.au.spring.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.spring.dao.interfaces.StudentDaoInterface;
import com.au.spring.model.Student;
import com.au.spring.rowmapper.StudentRowMapper;

@Repository
public class StudentDao implements StudentDaoInterface{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String getName() {
		return jdbcTemplate.queryForObject("select name from students where id=101", String.class);
	}

	public String insertStudentDetails(Student student) {
		jdbcTemplate.update("insert into students values("+student.getStudentId()+",\""+student.getStudentName()+"\");");
		return "inserted";
	}
	public List<Student> getAllStudentsRowMapper(){  
		return jdbcTemplate.query("select * from students",
                new StudentRowMapper());
		}

}
