package com.simplilearn.multithreading.synchronization.without.synchronization;

public class WithoutSynchronization {

	public static void main(String[] args) {
		WithoutSynchronization obj = new WithoutSynchronization();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
	}

	public void printTable (int n) {		
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
