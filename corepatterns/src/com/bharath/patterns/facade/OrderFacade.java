package com.bharath.patterns.facade;

public class OrderFacade {
	
	private OrderProcessor processor = new OrderProcessor();
	
	public void processOrder(String name, int quantity) {
		processor = new OrderProcessor();
		if (processor.checkStock(name)) {
			String orderId = processor.placeOrder(name,quantity);
			processor.shipOrder(orderId);
		}
	}

}
