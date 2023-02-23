package com.simplilearn.exception.handling;

public class Person {
	

	private String name;
	private int age;
	private String gender;

	public Person() {System.out.println("Noting to do in Person()");}
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
}
