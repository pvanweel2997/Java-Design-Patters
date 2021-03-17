package com.bharath.patterns.dao;

public interface StudentDAO {
	
	public void create(Student student);
	
	public void delete(int id);
	
	public Student getById(int id);

}
