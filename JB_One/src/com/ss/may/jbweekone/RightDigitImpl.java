package com.ss.may.jbweekone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigitImpl {

	public static void main(String[] args) {
		RightDigit rMost = (n) -> n.stream().map(x -> x % 10).collect(Collectors.toList());
		RightDigit doubling = (n) -> n.stream().map(x -> x * 2).collect(Collectors.toList());
		

		List<Integer> myList = new ArrayList<>();
		myList.add(4);
		myList.add(41);
		myList.add(33);
		myList.add(404);

		System.out.println(rMost.getRight(myList));
		System.out.println(doubling.getRight(myList));
	}

}
