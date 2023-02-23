package com.simplilearn.accessmodifiers;

public class PrivateAccessModifierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateAccessModifierExample privateObject = new PrivateAccessModifierExample();
		privateObject.checkEqualityBtwNos();
	}
	
	private void checkEqualityBtwNos() {
		String value1 = "John";
		String value2 = "John";
		
		System.out.println("value1 = value2 :: " + (value1==value2));
		
	}
}
