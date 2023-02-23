package com.simplilearn.multithreading.synchronization.with.block;

public class Thread2 extends Thread {
	TableWithSynchonizedBlock tb;
	
	Thread2(TableWithSynchonizedBlock tb) {
		this.tb = tb;
	}
	
	public void run() {
		tb.printTable(100);
		
	}

}
