package com.testThead.correct;

public class CusThread2 extends Thread {
	private TestThread t2;

	public CusThread2(TestThread t) {
		t2 = t;
	}

	@Override
	public void run() {
		// try {
		// Thread.sleep(300);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		t2.output();
	}
}
