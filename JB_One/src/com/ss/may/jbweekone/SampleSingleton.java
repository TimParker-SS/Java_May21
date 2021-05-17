package com.ss.may.jbweekone;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ss.may.jbdayfour.DCLSingleton;

public class SampleSingleton {
	private static Connection conn = null;
	volatile private static SampleSingleton instance = null;

	public static SampleSingleton getInstance() {
		if(instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}
}
