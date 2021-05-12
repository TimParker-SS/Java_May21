/**
 * 
 */
package com.ss.may.jbdaytwo;

/**
 * @author miz12
 *
 */
public class Triangle implements Shape {
	private Double base = 7.7, height = 12.3;

	@Override
	public Double calculateArea() {
		// TODO Auto-generated method stub
		return .5 * base * height;
	}

	@Override
	public void display() {
		System.out.println("Triangle display method");
	}
}
