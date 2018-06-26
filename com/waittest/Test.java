package com.waittest;

public class Test {

	public final int MAX_VALUE = 10;

	public int mCount = 1;

	public static void main(String[] args) {
		 Test t = new Test();
		 Consumer consumer = new Consumer(t);
		 Producter producter = new Producter(t);
		 consumer.start();
		 producter.start();

//		SyncStack stack = new SyncStack();
//		Consumer2 c = new Consumer2(stack);
//		Producter2 p = new Producter2(stack);
//
//		c.start();
//		p.start();
	}
}
