package com.simplilearn.exception.handling;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("John",20, "Male");
		Person p2 = new Person("JoSam",16, "Male");	
		
		try {
			validateAgeForVoting(p1.getAge());
			validateAgeForVoting(p2.getAge());
		}
		catch (InvalidAgeException iae) {
			System.out.println(iae);
		}

	}
	
	static void validateAgeForVoting(int age) throws InvalidAgeException {
		if (age < 18 ) {
			throw new InvalidAgeException ("invalid voting age");
		}
		System.out.println("Valid age");
	}
	

}
