package com.simplilearn.typecasting;

import java.util.Scanner;

public class ExplicitTypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Explicit Type Casting");
		System.out.println("Please Enter Number");
		Scanner inInput = new Scanner(System.in);
		double doubleValue = inInput.nextDouble();
		System.out.println("Value in Int::" + doubleValue);

		float floatValue = (float)doubleValue;
		long longValue = (long)floatValue;
		int intValue = (int)longValue;
		short shortValue = (short)intValue;
		System.out.println("Value in short::" + shortValue);
		System.out.println("Value in int::" + intValue);
		System.out.println("Value in long::" + longValue);
		System.out.println("Value in float::" + floatValue);
		System.out.println("Value in double::" + doubleValue);
	}
}	
