package com.ss.may.jbdaythree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharCounter {

	public static void main(String[] args) {
		char charToCount = args[0].charAt(0);
		int counter = 0;
		try (BufferedReader buf = new BufferedReader(
				new FileReader("C:\\Users\\miz12\\git\\Java_May21\\JB_One\\resources\\count.txt"))) {
			int data;
			while((data=buf.read())!= -1) {
				if(charToCount == (char)data) {
					counter++;
				}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Char " + charToCount + " # of occurances: " + counter);

	}

}
