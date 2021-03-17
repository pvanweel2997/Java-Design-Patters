package com.bharath.patterns.adapter;

public class WeatherAdapter {
	public int findTemperature(int zipcode) {
		String city = null;
		if (zipcode ==50263) {
			city = "Waukee";
		}
		WeatherFinder finder = new WeatherFinderImpl();
		int temperature	 = finder.find(city);
		return temperature;
	}
}
	