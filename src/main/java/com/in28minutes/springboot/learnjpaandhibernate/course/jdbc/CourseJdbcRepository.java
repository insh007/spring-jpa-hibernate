package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
				insert into course (id, name, author)
				values(1, 'Learn AWS', 'Udemy');
			""";
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}

/* Note:
 * we can perform insert, update and delete operation by using
 * the update() method itself.
 * 
 */
