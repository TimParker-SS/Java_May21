package com.ss.may.jbdayfive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithA {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("abc", "axe", "hello","ABC");
		StartsWithA swa = new StartsWithA();
		List<String> output = swa.ExtractAStrings(l);
		System.out.println(output);
	}
	
	public List<String> ExtractAStrings(List<String> l){
		
		return l.stream().filter(n -> n.length() == 3 && n.charAt(0) == 'a').collect(Collectors.toList());
		
	}

}
