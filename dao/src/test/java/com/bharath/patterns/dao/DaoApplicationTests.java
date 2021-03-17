package com.bharath.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaoApplicationTests {
	
	@Autowired
	private EmployeeDAO dao;
	
	@Autowired
	private StudentDAO  studentDAO;

	@Test
	void testCreate() {
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Patrick Van Weelden");
		dao.create(employee);
	}
	
	@Test
	void testCreateStudent() {
		Student student = new Student(2,"Patrick Van Weelden", 69);
		studentDAO.create(student);
	}
	
	@Test
	void testGetStudentById() {
		Student student = studentDAO.getById(1);
		System.out.println(student.getName());
	}
	
	@Test
	void testGetDeleteById() {
		studentDAO.delete(2);

	}

}
