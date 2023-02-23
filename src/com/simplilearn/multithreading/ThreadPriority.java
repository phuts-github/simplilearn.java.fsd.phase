package com.simplilearn.multithreading;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th1 = new Thread() {
			public void run() {
				System.out.println("Inside TH1 run");
			}
		};
		
		Thread th2 = new Thread() {
			public void run() {
				System.out.println("Inside TH2 run");
			}
		};
		
		Thread th3 = new Thread() {
			public void run() {
				System.out.println("Inside TH3 run");
			}
		};
		
		System.out.println("Deafault Thread Priority");
		System.out.println();
		System.out.println("TH1 priority : " + th1.getPriority());
		System.out.println("TH2 priority : " + th2.getPriority());
		System.out.println("TH3 priority : " + th3.getPriority());
		
		th1.setPriority(1);
		th2.setPriority(3);
		th3.setPriority(9);
		
		System.out.println("Modified Thread Priority");
		System.out.println();
		System.out.println("TH1 priority : " + th1.getPriority());
		System.out.println("TH2 priority : " + th2.getPriority());
		System.out.println("TH3 priority : " + th3.getPriority());
		
		System.out.println();
		System.out.println("Current Thread Name - " + Thread.currentThread().getName());
		System.out.println("Current Priority    - " + Thread.currentThread().getPriority());
		
	}

}
