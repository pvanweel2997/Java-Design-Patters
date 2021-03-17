package com.bharath.patterns.adapter.payment;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public double pay(double dollars) {
		return dollars;
	}

}
