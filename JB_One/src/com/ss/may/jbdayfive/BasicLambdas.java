package com.ss.may.jbdayfive;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BasicLambdas {

	public static void main(String[] args) {
		String[] names = {"Zoro", "Christopher", "Timothy", "Melvin"};
		// Sort by name asc
		System.out.println("Sort by name asc length");
		Arrays.sort(names, (a,b) -> Integer.compare(a.length(), b.length()));
		for(String n : names) {
			System.out.println(n);
		}
		System.out.println("\nSort by name desc length");
		// Sort by name desc
		Arrays.sort(names, (a,b) -> -1 * Integer.compare(a.length(), b.length()));
		for(String n : names) {
			System.out.println(n);
		}
		System.out.println("\nAlphabetically first char");
		// Alphabetically first char
		Arrays.sort(names, (a,b) -> Integer.compare(a.charAt(0), b.charAt(0)));
		for(String n : names) {
			System.out.println(n);
		}
		System.out.println("\nContain e comes first no static helper");
		// Contain e comes first no static helper
		Arrays.sort(names, (s1,s2) -> {
			if(s1.contains("e")) {
			return -1;
			}
			return 1;
		});
		for(String n : names) {
			System.out.println(n);
		}
		System.out.println("\nContain e comes first with static helper");
		// Contains e comes first with static helper
		Arrays.sort(names, (s1,s2) -> BasicLambdas.containsE(s1,s2));
		for(String n : names) {
			System.out.println(n);
		}
	}

	public static int containsE(String s1, String s2) {
		if (s1.contains("e")) {
			return -1;
		}
		return 1;
	}

}
