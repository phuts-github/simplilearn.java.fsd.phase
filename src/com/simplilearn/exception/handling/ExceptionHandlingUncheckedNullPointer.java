package com.simplilearn.exception.handling;

public class ExceptionHandlingUncheckedNullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("John",29, "Male");	
		Person p2 = new Person();
		System.out.println(p1.getName() + " == " + p1.getAge());
		
		try {
			System.out.println(p2.getName()  + " == " + p2.getName().length());;
		}
		catch (NullPointerException npe) {
			System.out.println(npe);
		}
		
			
	}

}
