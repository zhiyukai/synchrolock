package com.testThead.correct;

public class CusThread1 extends Thread {
	private TestThread t1;

	public CusThread1(TestThread t) {
		t1 = t;
	}

	@Override
	public void run() {
		// try {
		// Thread.sleep(300);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		t1.input();
	}
}
