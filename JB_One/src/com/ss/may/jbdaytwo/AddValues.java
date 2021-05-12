/**
 * 
 */
package com.ss.may.jbdaytwo;

/**
 * @author miz12
 *
 */
public class AddValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				total += Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println(args[i] + " is not a number. Will not add to total.");
			}
		}
		System.out.println("Total: " + total);

	}

}
