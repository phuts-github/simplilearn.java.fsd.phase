package com.simplilearn.strings;

public class StringEaxamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "John"; // reference
		System.out.println("S ===> " + s);

		String s1 = new String ("John"); // object
		System.out.println("S1 ===> " + s1);
		
		System.out.println("Comparison using double equals :: " + (s==s1)); // false  - it compares addresses
		System.out.println("Comparison using dot equals :: " + (s.equals(s1))); // true  - compares the values

		String a = "Harry";
		a.concat("Potter");
		System.out.println("a ===> " + a);
		
		a = a.concat("Potter"); // define new a
		System.out.println("a ===> " + a); // prints new a
		
		String b = "Potter";
		String c = "Potter";
		System.out.println("Comparison using double equals :: " + (c==c)); // false  - it compares addresses
		System.out.println("Comparison using dot equals :: " + (b.equals(c))); // true  - compares the values
	}

}
