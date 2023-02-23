package com.simplilearn.multithreading.synchronization.without.synchronization;

public class Thread2 extends Thread {
	WithoutSynchronization t;
	
	Thread2(WithoutSynchronization t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(100);
		
	}

}
