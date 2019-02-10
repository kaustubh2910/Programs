package com.multithreading.demo;

public class WaitNotify {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread2());
		t1.start();
		synchronized (t1) {
			
			System.out.println("waiting after Calling run method...");
			t1.wait();
			System.out.println("Got the notification...");
			System.out.println("Result is..." + MyThread2.fact);
		}
	}

}

class MyThread2 implements Runnable {
	static int fact = 1;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Starting calculation...");
			for (int i = 1; i <= 5; i++) {
				fact = fact * i;
			}
			System.out.println("Notifying main method with result...");
			this.notify();
		}

	}
}
