package com.testThead.error;

public class TestThread {

	private int data = 1;

	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		new CusThread1(testThread).start();
		new CusThread2(testThread).start();
	}

	public synchronized void input() {
		// data++;
		System.out.println("CusThread1 data = " + data);
	}

	public synchronized void output() {
		// data--;
		System.out.println("CusThread2 data = " + data);
	}

}
