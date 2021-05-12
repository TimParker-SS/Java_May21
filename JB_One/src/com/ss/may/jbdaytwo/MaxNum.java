/**
 * 
 */
package com.ss.may.jbdaytwo;

import java.util.Random;

/**
 * @author miz12
 *
 */
public class MaxNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int rows = rand.nextInt(10)+1;
		int cols = rand.nextInt(10)+1;
		int max = -1;
		int[][] matrix = new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				matrix[i][j] = rand.nextInt(100);
			}
		}
		int row = 0, col = 0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(matrix[i][j] > max) {
					max = matrix[i][j];
					row = i+1;
					col = j+1;
				}
			}
		}
		
		for(int[] a : matrix) {
			for(int i : a) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("Max Number: " + max);
		System.out.println("Row: " + row + " Col: " + col);
	}

}
