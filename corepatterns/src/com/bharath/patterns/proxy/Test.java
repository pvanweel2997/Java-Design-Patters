package com.bharath.patterns.proxy;

public class Test {
	
	public static void main(String[] args) {
		CustomerProxyImpl customer = new CustomerProxyImpl();
		System.out.println(customer.getId());
		System.out.println(customer.getOrders().size());
	}

}
