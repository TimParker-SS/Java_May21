package com.ss.may.jbdayfour;

public class DCLSingleton {
	volatile private static DCLSingleton instance = null;

	private DCLSingleton() {

	}

	public static DCLSingleton getInstance() {
		if(instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new DCLSingleton();
				}
			}
		}
		return instance;
	}
}
