package com.ss.may.jbdaythree;

import java.io.File;

public class PrintDirectory {

	public static void main(String[] args) {
		PrintDirectory pd = new PrintDirectory();
		String CWD = System.getProperty("user.dir");
		File dir = new File(CWD);
		File[] files = dir.listFiles();
		pd.printAll(files);
	}

	public void printAll(File[] files) {
		for (File file: files) {
			if(file.isFile()) {
				System.out.println(file.getName());
			}
			else if(file.isDirectory()) {
				System.out.println("==" + file.getName() + "==");
				printAll(file.listFiles());
			}
		}
	}

}
