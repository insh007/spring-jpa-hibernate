package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
				insert into course (id, name, author)
				values(?, ?, ?);
			""";
	
	private static String DELETE_QUERY = 
			"""
				delete from course where id = ?;
			""";
	
	private static String SELECT_QUERY = 
			"""
				select * from course where id = ?;
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY,
				course.getId(), course.getName(), course.getAutor());
	}
	
	public void deleteByID(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course selectByID(long id) {
		// ResultSet  =>  Bean  => Row Mapper =>
		return springJdbcTemplate.queryForObject(SELECT_QUERY, 
				new BeanPropertyRowMapper<>(Course.class), id);
		//second argument is for ResultSet
	}
	
}

/* Note:
 * we can perform insert, update and delete operation by using
 * the update() method itself.
 * 
 */
