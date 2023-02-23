package com.simplilearn.exception.handling;

public class MultipleCatchExample {

	public static void main(String[] args) {
		
		try {
			int a [] = new int [5];
			a[5] = 20 / 0;
			System.out.println("Array entry - " + a[6]);
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException Exception");
		}
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsException Exception");			
		}
		catch(NullPointerException npe) {
			System.out.println("Parent Exception");
		}
		catch(Exception e) {
			System.out.println("Parent Exception");
		}
		
		// finally - executes always 
		finally {
			System.out.println("Inside finally");
		}		
		
		System.out.println("Rest of the Code");

	}

}
