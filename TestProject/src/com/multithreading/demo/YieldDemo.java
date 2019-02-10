package com.multithreading.demo;


public class YieldDemo {
	
	public static void main(String[] args) throws InterruptedException {

		Thread t3 = new Thread(new MyThread3());
		t3.start();
		t3.setPriority(Thread.MIN_PRIORITY);
		for (int i = 1; i <= 5; i++) {
			System.out.println("In main thread "+t3.getPriority());
			Thread.sleep(500);
		}
		
	}

}

class MyThread3 implements Runnable {
	@Override
	public void run()  {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("In child thread");
			try {
				Thread.sleep(500);
				Thread.yield();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}

