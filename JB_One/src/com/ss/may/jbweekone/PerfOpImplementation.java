package com.ss.may.jbweekone;

public class PerfOpImplementation {
	
	public static void main(String[] args) {
		
		PerformOperation isOdd = (n) -> {
			if (n % 2 == 1) {
				System.out.println("ODD");
			}else {
				System.out.println("EVEN");
			}
		};
		PerformOperation isPrime = (n) -> {
			boolean isprime = true;
			for (int i = 2; i <= n / 2; ++i) {
			      if (n % i == 0) {
			        isprime = false;
			      }
			}
			if(isprime) {
				System.out.println("PRIME");
			}else {
				System.out.println("COMPOSITE");
			}
		};
		PerformOperation isPalindrome = (n) -> {
			String str = n.toString();
			String backStr = "";
		    
		    int strLength = str.length();
	
		    for (int i = (strLength - 1); i >=0; --i) {
		    	backStr = backStr + str.charAt(i);
		    }
		    if(str.equals(backStr)) {
		    	System.out.println("PALINDROME");
		    }else {
		    	System.out.println("NOT PALINDROME");
		    }
		};
		
		isPalindrome.check(2552);
		isOdd.check(2552);
		isPrime.check(8);
	}
}