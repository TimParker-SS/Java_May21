package com.ss.may.jbdayfive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEven {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		OddEven oe = new OddEven();
		myList.add(3);
		myList.add(44);
		
		String output = oe.oddEven(myList);
		System.out.println(output);
	}
	
	public String oddEven(List<Integer> myList) {
		Stream<Integer> intStream = myList.stream();
		return intStream.map(num -> num % 2 == 0 ? "e"+num : "o"+num).collect(Collectors.joining(","));
	}

}
