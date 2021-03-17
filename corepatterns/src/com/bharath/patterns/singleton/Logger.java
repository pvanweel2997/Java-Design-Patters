package com.bharath.patterns.singleton;
import java.io.Serializable;

public class Logger implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private static Logger instance = null;
	private Logger() {
	}
	
	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
