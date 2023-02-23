package com.simplilearn.multithreading.interthread.communication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// wait - 
		// notify - 
		// notifyall - 
		
	
		CommunicationTest ct = new CommunicationTest();
		Thread th = new Thread() {
			public void run () {
				ct.withdraw(2000);
			}
		};
		th.start();
		
		Thread th2 = new Thread() {
			public void run () {
				ct.deposit(2000);
			}
		};
		th2.start();

	}

}
