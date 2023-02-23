package com.simplilearn.functions;

public class StudentMethodOverridingExample extends PersonMethodOverridingExample {
	
	public static void main(String[] args) {
		StudentMethodOverridingExample stud = new StudentMethodOverridingExample();
		stud.work(); // work() function belongs/inherited to extended Person function
	}
	
	// this is overriding the Person's work() function
	//the behavior is overridden
	public void work() {
		System.out.println("The more you work towards your goal you will get results...");
	}
}
