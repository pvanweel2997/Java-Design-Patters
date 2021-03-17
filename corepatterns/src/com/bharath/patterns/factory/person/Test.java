package com.bharath.patterns.factory.person;

public class Test {

	public static void main(String[] args) {
		PersonStore store = new PersonStore();
		Person p = store.orderPerson("female");
		System.out.println(p instanceof Female);
	}
}
