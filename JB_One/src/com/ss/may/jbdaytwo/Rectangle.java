/**
 * 
 */
package com.ss.may.jbdaytwo;

/**
 * @author miz12
 *
 */
public class Rectangle implements Shape {
	private Double base = 3.4, width = 5.7;
	@Override
	public Double calculateArea() {
		// TODO Auto-generated method stub
		return base * width;
	}

	@Override
	public void display() {
		System.out.println("Rectangle display method");
		
	}

}
