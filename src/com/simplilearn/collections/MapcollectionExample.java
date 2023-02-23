package com.simplilearn.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapcollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Maps - key and value based collections
		//Sets - value based collections
		
		System.out.println("--------");
		System.out.println("-HasMap-");
		System.out.println("--------");
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("ID001", "Roney");
		hashMap.put("ID002", "Sam");
		hashMap.put("ID005", "Sammy");
		hashMap.put("ID009", "Sama");
		
		hashMap.put("ID001", "Roney2");
		System.out.println("put sama2 -> " + hashMap.put("ID009", "Sama2"));
		System.out.println("HasMap -> " + hashMap);
		

		
		System.out.println("---------------");
		System.out.println("-linkedHashMap-");
		System.out.println("---------------");
		
		Map <String , String> linkedHashMap = new LinkedHashMap<>();
		
		
		
		System.out.println("---------");
		System.out.println("-TreeMap-");
		System.out.println("---------");
		
		Map <String , String> treeMap = new TreeMap<>();
		
		
		

	}

}
