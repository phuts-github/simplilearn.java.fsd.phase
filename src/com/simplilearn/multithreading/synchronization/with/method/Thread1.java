package com.simplilearn.multithreading.synchronization.with.method;

public class Thread1 extends Thread {
	
	TableWithSynchonizedMethod t;
	
	Thread1(TableWithSynchonizedMethod t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(5);
		
	}

}
