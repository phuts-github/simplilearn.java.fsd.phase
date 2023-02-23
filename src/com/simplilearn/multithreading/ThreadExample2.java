package com.simplilearn.multithreading;

public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using threa created by implementing Runnable class ...");
		
		RunnableClass runnableClass = new RunnableClass();
		Thread thread = new Thread(runnableClass);
		thread.start();

	}

}
