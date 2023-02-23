package com.simplilearn.accessmodifiers;

public class DefaultAccessModifierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAccessModifierExample defaultClassObject = new DefaultAccessModifierExample();
		defaultClassObject.divideNumbers();
	}
	
	//default method/function
	void divideNumbers() {
		int value1 = 10;
		int value2 = 2;
		
		System.out.println("The division of value1 and value2 is :: " +(value1/value2));
	}

}
