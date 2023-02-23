package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollectionExample {
	public static void main(String[] args) {
		//List<String> friendList = new ArrayList<String>();
		List<String> friendList = new ArrayList<>(); //same as above
		
		//adsd to list
		friendList.add("Sam");
		friendList.add("John");
		friendList.add("Jack");
		friendList.add("Sohan");
		
		//print list
		System.out.println("My friends list is ::" + friendList);
		
		//enhance for loop
		for (String name: friendList) {
			System.out.println("Array List ::" + name);
		}
		
		//print index value
		System.out.println("index #3 is " + friendList.get(3));
		
		
		//linklist
		List<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("A");
		namesLinkedList.add("B");
		namesLinkedList.add("C");
		namesLinkedList.add("D");
		
		for (String name: namesLinkedList) {
			System.out.println("LinledList  ::" + name);
		}
		
		
		
	}

}
