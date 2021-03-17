package com.bharath.patterns.factory;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing Chicken Pizza...");
	}

	@Override
	public void bake() {
		System.out.println("Baking Cheese Chicken...");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Cheese Chicken...");

	}

}

