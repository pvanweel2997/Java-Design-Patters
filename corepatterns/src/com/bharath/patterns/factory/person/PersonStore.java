package com.bharath.patterns.factory.person;

public class PersonStore {
	
	public Person orderPerson(String Type) {
		Person p = PersonFactory.createPerson(Type);
		p.wish();
		
		return p;
	}

}
