package com.simplilearn.multithreading.interthread.communication;

public class CommunicationTest {
	
	int amount = 1000;
	
	public synchronized void withdraw(int amt) {
		System.out.println("going to withdraw amount - " + amt);
		if (this.amount < amt) {
			System.out.println("Less Balance, waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount -= amt;
//			this.amount = this.amount - amt;
			System.out.println("Withdrawal " + amt + " completed. Balance " + this.amount);
		}
	}
	
	public synchronized void deposit(int amt ) {
		System.out.println("Going to deposit amount - " + amt);
		this.amount += amt;
		System.out.println("Total balance - " + amount);
		notify();
	}
}
