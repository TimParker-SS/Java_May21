package com.ss.may.jbdayfour;

public class ProConDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProCon pc = new ProCon();
		
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		
		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
	


	}

}
