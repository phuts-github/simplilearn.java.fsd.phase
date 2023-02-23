package com.simplilearn.multithreading.state;

public class ThreadState implements Runnable {
	
	public static Thread t1;
	public static ThreadState obj;
	
	public static void main(String[] args) {
		obj = new ThreadState();
		t1 = new Thread(obj);
		
		System.out.println("The state of thread t1 after spawning " +t1.getState());
		
		t1.start();
		
		System.out.println("The state of thread t1 after invoking start method " +t1.getState());
	}
	
	
	
	@Override
	public void run() {
		//class will not work without object
		ABC abc = new ABC();
		Thread t2 = new Thread (abc); 
		System.out.println("The state of thread t2 after spawnning it " +t2.getState());
		
		t2.start();
		
		System.out.println("The state of thread t2 after invoking start method " +t2.getState());
		
		try {
			//moving t2 to waiting state
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("The state of thread t2 after invoking sleep method " +t2.getState());
		
		
		try {
			//waiting for t2 to complete execution
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The state of thread t2 when completed execution " +t2.getState());
	}

}
