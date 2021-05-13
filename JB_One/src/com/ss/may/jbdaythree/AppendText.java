package com.ss.may.jbdaythree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppendText {

	public static void main(String[] args) {
		try {
			FileOutputStream fWrite = new FileOutputStream("C:\\Users\\miz12\\git\\Java_May21\\JB_One\\resources\\test.txt",true);
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter text to append: ");
			String text = sc.nextLine();
			fWrite.write(text.getBytes());
			fWrite.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
