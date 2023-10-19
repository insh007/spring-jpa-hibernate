package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) {
		repository.save(new Course(1, "Learn Spring Data JPA", "Coursera"));
		repository.save(new Course(2, "Learn C++", "Coursera"));
		repository.save(new Course(3, "Learn Java", "Coursera"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
//		System.out.println(repository.findByAutor("Coursera"));
//		System.out.println(repository.findByAutor(""));
		
		System.out.println(repository.findByName("Learn Spring Data JPA"));
		System.out.println(repository.findByName(""));
	}
	
}

/* Notes:
 *  1. To run the JdbcTemplate we need to implement CommandLineRunner .
 *  2. Now save, deleteById, findById is provided by using Spring Data JPA for that need to 
 *  create an interface and then need to implements an interface which is "JpaRepository"
 */ 