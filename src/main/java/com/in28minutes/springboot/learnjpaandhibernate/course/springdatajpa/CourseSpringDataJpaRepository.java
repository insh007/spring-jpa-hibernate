package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

		List<Course> findByAutor(String author);
		//Note: findByAutor is like a custom method which we can create in this extends interface
		//      and author(or any field) must be present in our Entity class(Course)
		// 		so we can capitalize first letter and then can add in the structured methods 
		//      which is providing by "JpaRepository"
		
		//Similar Custom method like above to find by name and name must be present in our
		//Entity class
		List<Course> findByName(String name);
}
