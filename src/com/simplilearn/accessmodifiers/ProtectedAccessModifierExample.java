package com.simplilearn.accessmodifiers;

public class ProtectedAccessModifierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccessModifierExample protectecClassObject = new ProtectedAccessModifierExample();
		protectecClassObject.modulusOrRemainderOfNumbers();
	}
	
	//default method/function
	protected void modulusOrRemainderOfNumbers() {
		long value1 = 20;
		long value2 = 10;
		
		System.out.println("The modulusOrRemainder of value1 and value2 is :: " +(value1%value2));
	}

}
