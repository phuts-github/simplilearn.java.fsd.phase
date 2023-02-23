package com.simplilearn.multithreading;

public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Using threa created by extending Thread class ...");
		
		ThreadClass threadClass = new ThreadClass();
		threadClass.start();
		
		RunnableClass runnableClass = new RunnableClass();
		Thread thread = new Thread(runnableClass);
		thread.start();


	}

}
