/**
 * 
 */
package com.ss.may.jbdayone;

import java.util.Random;
import java.util.Scanner;

/**
 * User guesses a random integer
 * @author miz12
 *
 */
public class AssignmentTwo {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int guessCount = 0;
		boolean correct = false;
		int answer = rand.nextInt(100);
		Scanner guess = new Scanner(System.in);
		System.out.println("Answer is " + answer);
		System.out.print("Guess a number 1-100: ");
		int userGuess = guess.nextInt();
		if(Math.abs(userGuess-answer) <= 10) {
			correct = true;
		}
		else {
			guessCount++;
		}
		while(!correct && guessCount < 5) {
			if(Math.abs(userGuess-answer) <= 10) {
				correct = true;
			}
			else {
				System.out.println("Incorrect guess again: ");
				userGuess = guess.nextInt();
				guessCount++;
			}
		}
		if(correct) {
			System.out.println("The answer was " + answer);
		}
		else {
			System.out.println("Sorry the correct answer was " + answer);
		}
	}

}
