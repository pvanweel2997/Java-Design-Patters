package com.bharath.patterns.factory.person;

public class PersonFactory {

	public static Person createPerson(String type) {
		Person p = null;
		if ("male".equals(type )) {
			p = new Male();
		} else if ("female".equals(type)) {
			p = new Female();
		}
		return p;
	}
	
}
