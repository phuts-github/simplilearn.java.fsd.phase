package com.typecasting;

import java.util.Scanner;

public class ImplicitTypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Implicit Type Casting");
		System.out.println("Please Enter Number");
		Scanner byteInput = new Scanner(System.in);
		byte byteValue = byteInput.nextByte();
		System.out.println("Value in byte::" + byteValue);
		short shortValue = byteValue;
		int intValue = shortValue;
		long longValue = intValue;
		float floatValue = longValue;
		double doubleValue = floatValue;
		System.out.println("Value in short::" + shortValue);
		System.out.println("Value in int::" + intValue);
		System.out.println("Value in long::" + longValue);
		System.out.println("Value in float::" + floatValue);
		System.out.println("Value in double::" + doubleValue);
	}

}
