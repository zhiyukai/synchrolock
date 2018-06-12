package com.testThead.error;

public class CusThread1 extends Thread {
	private TestThread t1;

	public CusThread1(TestThread t) {
		t1 = t;
	}

	@Override
	public void run() {
		while (true) {
			// try {
			// Thread.sleep(300);
			// } catch (InterruptedException e) {
			// e.printStackTrace();
			// }
			t1.input();
		}
	}
}
