package com.simplilearn.functions;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//overloaded methods:
	// when they have same name, and
	// when return types are same, parameter types are different
	// when return types are same, parameter numbers are different
	public int addition(int a, int b) {
		return a + b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

//
	public int multiplication(int a, int b) {
		return a * b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}
	
	public double multiplication(int a, double b) {
		return a * b;
	}
	
//	//duplicates - when only return types are different
//	public int subtratraction(int a, int b) {
//		return a - b;
//	}
//
//	public double subtratraction(int a, int b) {
//		return a - b;
//	}	



}

