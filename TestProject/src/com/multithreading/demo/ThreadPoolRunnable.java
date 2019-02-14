package com.multithreading.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolRunnable {

	public static void main(String[] args) throws InterruptedException {
		PrintJob[] jobs = { new PrintJob("Kaustubh"), new PrintJob("Pooja"), new PrintJob("John"),
				new PrintJob("Catherine"),new PrintJob("Amanda"),new PrintJob("Lucy") };		
		
		ExecutorService service = Executors.newFixedThreadPool(3);	
		for(PrintJob job:jobs) {
			service.submit(job);
		}
		service.shutdown();
	}

}

class PrintJob implements Runnable {
	String name;

	public PrintJob(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + "...Job Started by Thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "...Job Completed by Thread " + Thread.currentThread().getName());
	}
}
