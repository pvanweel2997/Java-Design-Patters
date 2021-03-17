package com.bharath.patterns.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(Student student) {
		String sql = "insert into mydb.student values(?,?,?)";
		jdbcTemplate.update(sql, student.getId(), student.getName(), student.getTestScore());
	}

	@Override
	public void delete(int id) {
		String sql = "delete from mydb.student where id = ?";
		jdbcTemplate.update(sql, new Object[]{id});
	}

	@Override
	public Student getById(int id) {
		String sql = "select * from mydb.student where id = ?";
		Student student = new Student();
		jdbcTemplate.query(sql, new Integer[] { id },new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				student.setId(rs.getInt("ID"));
				student.setName(rs.getString("NAME"));
				student.setTestScore(rs.getInt("testScore"));
			}
		});
		return student;

	}

}
