package com.bharath.patterns.command;

public class OffCommand implements Command {
	
	Television television;
	
	OffCommand(Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.off();

	}

}
