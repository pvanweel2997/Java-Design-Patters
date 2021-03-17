package com.bharath.patterns.templatemethod.computermanufacturer;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("adding hard drive to desktop");
	}

	@Override
	public void addRam() {
		System.out.println("adding ram to desktop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("adding keyboard to desktop");

	}

}
