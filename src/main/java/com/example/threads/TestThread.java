package com.example.threads;

public class TestThread {

	public static void main(String[] args) {
		ThreadTester thread01= new ThreadTester();
		thread01.start();

	}

}

class ThreadTester extends Thread{
	
	public void run() {
		System.out.println("Thread Name "+Thread.currentThread().getName());
	}
}
