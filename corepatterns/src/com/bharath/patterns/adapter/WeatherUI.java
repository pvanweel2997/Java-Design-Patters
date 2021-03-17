	package com.bharath.patterns.adapter;

public class WeatherUI {
	public void showTemperature(int zipcoode) {
		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findTemperature(50263));
	}
	
	public static  void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.showTemperature(50263);
		
	}
}
