package com.simplilearn.multithreading.synchronization.without.synchronization;

import com.simplilearn.multithreading.synchronization.with.block.TableWithSynchonizedBlock;

public class Thread1 extends Thread {
	
	WithoutSynchronization t;
	
		
	Thread1(WithoutSynchronization t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(5);
		
	}

}
