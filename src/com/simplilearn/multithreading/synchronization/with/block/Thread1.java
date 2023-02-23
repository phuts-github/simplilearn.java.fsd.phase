package com.simplilearn.multithreading.synchronization.with.block;

public class Thread1 extends Thread {
	
	TableWithSynchonizedBlock tb;
	
	Thread1(TableWithSynchonizedBlock tb) {
		this.tb = tb;
	}
	
	public void run() {
		tb.printTable(5);
		
	}

}
