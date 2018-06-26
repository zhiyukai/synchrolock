package com.waittest;

public class Consumer2 extends Thread {

	private SyncStack stack;

	public Consumer2(SyncStack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		while (true) {
			this.stack.pop();
			try {
				sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
