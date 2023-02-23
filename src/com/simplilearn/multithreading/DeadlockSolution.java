package com.simplilearn.multithreading;

public class DeadlockSolution {
	public static void main (String[] args)	{
		DeadlockSolution dls = new DeadlockSolution();
		final resource1 rs1 = dls.new resource1();
		final resource2 rs2 = dls.new resource2();
		Runnable r1 = new Runnable() {
			public void run() {
				synchronized (rs2) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (rs1) {
						System.out.println("Thread 1 : Inside Fisrt Synchronizition Block");
					}
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				synchronized (rs2) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (rs1) {
						System.out.println("Thread 2 : Inside Fisrt Synchronizition Block");
					}
				}
			}
		};	
		
		new Thread(r1).start();
		new Thread(r2).start();
	}
	
private class resource1 {
	private int i = 10;
	public int getI() {
		return i;
	}
	
	public void set(int i) {
		this.i = i;
	}
}

private class resource2 {
	private int i = 20;
	public int getI() {
		return i;
	}
	
	public void set(int i) {
		this.i = i;
	}
}

}

