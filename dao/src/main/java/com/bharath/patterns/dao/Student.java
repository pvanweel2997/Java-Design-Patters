package com.bharath.patterns.dao;

public class Student {
	
	private int id;
	private String name;
	private int testScore;
	
	public Student (int id, String name, int testScore) {
		this.id = id;
		this.name = name;
		this.testScore = testScore;
	}
	
	public Student() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	
	
	

}
