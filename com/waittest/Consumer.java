package com.waittest;

public class Consumer extends Thread {

	Test t;
	boolean waitFlag;

	public Consumer(Test t) {
		this.t = t;
	}

	@Override
	public void run() {
		while (true) {
		synchronized (Test.class) {
			this.t.mCount--;
				System.out.println("Consumer mCount = " + t.mCount);
				try {
					Thread.sleep(600);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				if (t.mCount < 0) {
					try {
						System.out.println("Consumer t.wait()");
						waitFlag = true;
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
