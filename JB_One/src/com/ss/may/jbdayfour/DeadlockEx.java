package com.ss.may.jbdayfour;

public class DeadlockEx {

	public static void main(String[] args) {
		Integer x=3,y=2;
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				try {
					synchronized (x) {
						Thread.sleep(100);
						synchronized (y) {
							System.out.println("Thread 1 needs y");
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		
		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (y) {
						Thread.sleep(100);
						synchronized (x) {
							System.out.println("Thread 2 needs x");
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();

	}

}
