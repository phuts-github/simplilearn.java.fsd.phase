package com.simplilearn.multithreading.synchronization.with.method;

public class Synchronization {
	public static void main(String[] args) {
		TableWithSynchonizedMethod obj = new TableWithSynchonizedMethod();

		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
	
		t1.start();
		t2.start();

	}

}
