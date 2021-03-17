package com.bharath.patterns.templatemethod;

public class Test {

	public static void main(String[] args) {
		DataRenderer dr = new XMLDataRenderer();
		dr.render();
		
		DataRenderer csvdr = new CSVDataRenderer();
		csvdr.render();


	}

}
