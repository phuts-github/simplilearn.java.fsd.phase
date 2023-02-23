package com.simplilearn.multithreading.synchronization.with.block;

public class TableWithSynchonizedBlock {
//	void printTable (int n) {
//	synchronized void printTable (int n) {
	void printTable (int n) {			
		synchronized (this) {
		System.out.println("The thread coming to print table of " + n );
			for (int i = 1;i <= 5; i++) {
				System.out.println(n * i);
				
				try {
				Thread.sleep(400);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
					
				}
				
			}
		}
	}
	
}
