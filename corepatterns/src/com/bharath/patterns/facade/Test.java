package com.bharath.patterns.facade;

public class Test {

	public static void main(String[] args) {
		OrderProcessor processor = new OrderProcessor();
		if (processor.checkStock("Mac Book")) {
			String orderId = processor.placeOrder("Mac Book",100);
			processor.shipOrder(orderId);
		}
		
		
		//=================== facade way
		OrderFacade orderFacade = new OrderFacade();
		orderFacade.processOrder("Mac Pro", 10);
	}

}
