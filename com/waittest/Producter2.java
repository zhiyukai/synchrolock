package com.waittest;

public class Producter2 extends Thread {

	private SyncStack stack;

	public Producter2(SyncStack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		while (true) {
			this.stack.push();
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
