package com.bharath.patterns.adapter.payment;

public class PaymentApp {
	public void pay(int rupees) {
		PaymentAdapter pa = new PaymentAdapter();
		double value = pa.pay(rupees);
		PaymentProcessor pp = new PaymentProcessorImpl();
		System.out.println(pp.pay(value));
	}
	
	public static  void main(String[] args) {
		PaymentApp pa = new PaymentApp();
		pa.pay(500);
		
	}
}
