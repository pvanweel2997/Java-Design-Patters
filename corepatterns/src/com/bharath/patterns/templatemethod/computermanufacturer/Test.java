package com.bharath.patterns.templatemethod.computermanufacturer;

public class Test {

	public static void main(String[] args) {
		ComputerManufacturer  desktop = new DesktopManufacturer();
		desktop.buildComputer();
		
		ComputerManufacturer  laptop = new LaptopManufacturer();
		laptop.buildComputer();

	}

}
