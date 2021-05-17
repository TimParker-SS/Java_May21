package com.ss.may.jbweekone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveX {

	public static void main(String[] args) {
		RemoveX rx = new RemoveX();
		List<String> l = Arrays.asList("abxxc", "axe", "hexllo","ABxxxC");
		System.out.println(rx.deleteX(l));
	}
	
	public List<String> deleteX(List<String> str){
		return str.stream().map(s -> s.replaceAll("x", "")).collect(Collectors.toList());
	}

}
