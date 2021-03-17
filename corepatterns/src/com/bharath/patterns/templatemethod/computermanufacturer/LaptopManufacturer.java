package com.bharath.patterns.templatemethod.computermanufacturer;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("adding hard drive to laptop");
	}

	@Override
	public void addRam() {
		System.out.println("adding ram to laptop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("adding keyboard to laptop");

	}

}
