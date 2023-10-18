package com.in28minutes.springboot.learnjpaandhibernate.course;

public class Course {
	private long id;
	private String name;
	private String autor;
	
	public Course() {
		
	}
	
	public Course(long id, String name, String autor) {
		super();
		this.id = id;
		this.name = name;
		this.autor = autor;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAutor() {
		return autor;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", autor=" + autor + "]";
	}
	
	
}
