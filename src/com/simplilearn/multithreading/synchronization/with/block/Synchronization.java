package com.simplilearn.multithreading.synchronization.with.block;

public class Synchronization {
	public static void main(String[] args) {
//		TableWithSynchonizedMethod obj = new TableWithSynchonizedMethod();
		TableWithSynchonizedBlock obj = new TableWithSynchonizedBlock();
//		Thread1 t1 = new Thread1(obj);
//		Thread2 t2 = new Thread2(obj);
		
		Thread1 tb1 = new Thread1(obj);
		Thread2 tb2 = new Thread2(obj);
		
//		t1.start();
//		t2.start();
		
		tb1.start();
		tb2.start();
	}

}
