package com.waittest;

public class Producter extends Thread {

	Test t;
	boolean waitFlag;

	public Producter(Test t) {
		this.t = t;
	}

	@Override
	public void run() {

		while (true) {
		synchronized (Test.class) {
				this.t.mCount++;
				try {
					Thread.sleep(600);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("Producter mCount = " + this.t.mCount);

				if (this.t.mCount == t.MAX_VALUE) {
					try {
						System.out.println("Producter t.wait()");
						Test.class.wait();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Test.class.notifyAll();
			}
		}
	}
}
