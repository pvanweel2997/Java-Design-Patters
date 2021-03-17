package com.bharath.patterns.factory;

public class PizzaFactory {
	public static Pizza createPizza(String type) {
		Pizza p = null;
		if ("cheese".equals(type)) {
			p = new CheesePizza();
		} else if ("chicken".equals(type)) {
			p = new ChickenPizza();
		} else if ("veggie".equals(type)) {
			p = new VeggiePizza();
		}
		return p;
	}
}
