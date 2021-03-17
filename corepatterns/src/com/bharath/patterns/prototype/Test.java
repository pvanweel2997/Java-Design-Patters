package com.bharath.patterns.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Overwatch");
		Membership membership = new Membership();
		game1.setMembership(membership);
		
		Game game2 = game1.clone();
		System.out.println(game1.toString());
		System.out.println(game2.toString());
		
		Game game3 = new Game(game1);
		System.out.println(game3.toString());

	}

}
