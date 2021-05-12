/**
 * 
 */
package com.ss.may.jbdaytwo;

/**
 * @author miz12
 *
 */
public class Circle implements Shape {

	private Double radius = 4.3;

	@Override
	public Double calculateArea() {
		return Math.PI * (radius * radius);
	}

	@Override
	public void display() {
		System.out.println("Circle display method");
	}

}
