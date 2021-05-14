package com.ss.may.jbdayfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProCon {
	List<Integer> list = new ArrayList<Integer>();
	int capacity = 4;
	Random rand = new Random();
	
	public void produce() throws InterruptedException {
		int value = rand.nextInt(100);
		while(true) {
			synchronized(this) {
				while(list.size() == capacity) {
					wait();
				}
				
				System.out.println("Produced: " + value);
				list.add(value);
				value = rand.nextInt(100);
				
				notify();
				Thread.sleep(300);
			}
		}
	}
	
	public void consume() throws InterruptedException {
		while(true) {
			synchronized(this) {
				while(list.size() == 0)
					wait();
				
				int val = list.remove(0);
				System.out.println("Consumed: " + val);
				
				notify();
				Thread.sleep(300);
			}
		}
	}
}
