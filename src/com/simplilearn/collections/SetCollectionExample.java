package com.simplilearn.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<>();


		hashSet.add("John");
		hashSet.add("Alex");
		hashSet.add("Sam");
		hashSet.add("Rob");
		hashSet.add("Alex");
		System.out.println("1st null added ? :: " + hashSet.add("null"));
		System.out.println("2nd null added ? :: " + hashSet.add("null"));
		System.out.println("1st null added ? :: " + hashSet.add(null));
		System.out.println("2nd null added ? :: " + hashSet.add(null));
				
		System.out.println("HashSet ==> " + hashSet);
		
		Iterator<String> hashSetItr = hashSet.iterator();
		while (hashSetItr.hasNext()) {
			System.out.println(hashSetItr.next());
		}
		
//		hashSet.clear();
//		hashSet.removeAll(hashSet);
//		hashSet.remove(null);
//		hashSet.remove("Rob");
//		hashSet.removeIf(str -> str.contains("Alex"));
//		System.out.println();
		
		for (String s: hashSet) {
			System.out.println("--> " + s);
//			if (s.contains("Rob")) {
//				hashSet.remove(s);
//			}
		}
//		
		System.out.println("Modify hashSet -> " + hashSet);
		
		
		
		

	//---
		Set<String> linkedHashSet = new LinkedHashSet<>(); // insertion order is maintained, so uses more memory
		
		linkedHashSet.add("Chess");
		linkedHashSet.add("Cricket");
		linkedHashSet.add("Basketball");
		linkedHashSet.add("Volleyball");
		linkedHashSet.add("Football");
		
		System.out.println("LinkedHashSet ==> " + linkedHashSet);
		linkedHashSet.remove("Basketball");
		System.out.println("LinkedHashSet after remove ==> " + linkedHashSet);
		
		
	//---		
		Set<String> treeSet = new TreeSet<>(); // no null values allowed // maintains order
		
		treeSet.add("John");
		treeSet.add("Alex");
		treeSet.add("Sam");
		treeSet.add("Rob");
		treeSet.add("Alex");
		
		System.out.println("TreeSet ==> " + treeSet);	
		treeSet.remove("Sam");
		System.out.println("TreeSet after remove ==> " + treeSet);
			
		
		
	}

	
	
	
	
}
