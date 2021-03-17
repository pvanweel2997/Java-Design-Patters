package com.bharath.patterns.factory;

public class Test {

	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();
		Pizza p = store.orderPizza("veggie");
		System.out.println(p instanceof VeggiePizza);
	}
}
