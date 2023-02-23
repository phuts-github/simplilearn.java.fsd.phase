package com.simplilearn.multithreading.synchronization.with.method;

public class Thread2 extends Thread {
	TableWithSynchonizedMethod t;
		
	Thread2(TableWithSynchonizedMethod t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(100);
		
	}

}
