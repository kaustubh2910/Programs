package com.multithreading.demo;

public class JoinDemo {
	
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new MyThread());
		t1.start();
		t1.join();
		System.out.println("In "+Thread.currentThread().getName()+" waiting to join "+t1.getName()+" ::"+MyThread.fact);
	}

}

class MyThread implements Runnable {
	static int fact = 1;
	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Calculating fact::"+fact);
			fact = fact * i;
		}
		
	}

}
