package com.waittest;

public class SyncStack {
	public final int MAX_VALUE = 10;
	public int mCount = 1;

	// 供生产者调用
	public synchronized void push() {
		if (mCount == MAX_VALUE) {
			try {
				System.out.println("push wait()");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		mCount++;
		System.out.println("push mCount = " + mCount);
		this.notify();// 唤醒在此对象监视器上等待的单个线程
	}

	// 供消费者调用
	public synchronized void pop() {
		if (mCount == 0) {
			try {
				System.out.println("pop wait()");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		mCount--;
		System.out.println("pop mCount = " + mCount);
		this.notify();
	}
}
