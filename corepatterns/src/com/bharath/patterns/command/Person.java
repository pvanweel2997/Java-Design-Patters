package com.bharath.patterns.command;

public class Person {

	public static void main(String[] args) {
		Television television = new Television();
		RemoteControl remote = new RemoteControl();
		OnCommand on = new OnCommand(television);
		remote.setCommand(on);
		remote.pressButton();
		
		OffCommand off = new OffCommand(television);
		remote.setCommand(off);
		remote.pressButton();
	}
}
