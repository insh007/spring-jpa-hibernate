package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) {
		repository.insert(new Course(1, "Learn JPA", "Coursera"));
		repository.insert(new Course(2, "Learn C++", "Coursera"));
		repository.insert(new Course(3, "Learn Java", "Coursera"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		
	}
	
}

/* 
 * To run the JdbcTemplate we need to implement CommandLineRunner .
 */