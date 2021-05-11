package com.ss.may.jbone;

/**
 * Prints series of patterns.
 * 
 * @author miz12
 *
 */
public class AssignmentOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)");
		patternOne();
		System.out.println("...........");
		System.out.println("2)");
		System.out.println("...........");
		patternTwo();
		System.out.println("...........");
		System.out.println("3)");
		System.out.println("...........");
		patternThree(4);
		System.out.println("...........");
		System.out.println("4)");
		System.out.println("...........");
		patternFour(4);
	}
	
	public static void patternOne() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void patternTwo() {
		for (int i = 4; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void patternThree(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void patternFour(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*n-(2*i+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
