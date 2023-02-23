package com.simplilearn.accessmodifiers;

public class PublicAccessModifierExample {
	//main method
	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 20;
		//print all text
		System.out.println("The sum of value1 and value2 is :: " + value1 + value2);
		//print text and sum of values
		System.out.println("The sum of value1 and value2 is :: " + (value1 + value2));
		
		//create object for default constructor
		PublicAccessModifierExample constName = new PublicAccessModifierExample();
		constName.multiplyNumbers();
	}	
	
	//custom method
	public void multiplyNumbers() {
		int value1 = 10;
		int value2 = 20;
		//print all text
		System.out.println("The sum of value1 and value2 is :: " + value1 + value2);
		//print text and sum of values
		System.out.println("The multiply sum of value1 and value2 is :: " + (value1 * value2));
				
	}
}
