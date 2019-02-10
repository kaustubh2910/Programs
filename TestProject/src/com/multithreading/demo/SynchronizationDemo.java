package com.multithreading.demo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Display dObj = new Display();
		Thread t2 = new Thread(new MyThread1(dObj, "Kaustubh"));
		Thread t3 = new Thread(new MyThread1(dObj, "Pooja"));
		t2.start();
		t3.start();

	}

}

class MyThread1 implements Runnable {

	Display dObj;
	String name;

	MyThread1(Display dObj, String name) {
		this.dObj = dObj;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				dObj.show(name);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Display {

	public synchronized void show(String name) throws InterruptedException {
		System.out.println("Hiiii ! " + name);
		Thread.sleep(500);

	}
}
