package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) {
		repository.insert(new Course(1, "Learn AWS", "Coursera"));
		repository.insert(new Course(2, "Learn C++", "Coursera"));
		repository.insert(new Course(3, "Learn Java", "Coursera"));
		
		repository.delete(2);
	}
	
}

/* 
 * To run the JdbcTemplate we need to implement CommandLineRunner .
 */