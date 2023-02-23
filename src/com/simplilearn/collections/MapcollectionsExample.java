package com.simplilearn.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapcollectionsExample {

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
		
		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println("Key : " + m.getKey() + " Value : " + m.getValue());
		}
		
		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println("HashMap entry : " + m);
		}
		
		// copy one hashmap into another
		Map<String, String> hashMap2 = new HashMap<>();
		
		hashMap2.put("ID001b", "Roneyb");
		hashMap2.put("ID002b", "Samb");
		hashMap2.put("ID005b", "Sammyb");
		hashMap2.put("ID009b", "Samab");
		hashMap2.put(null, "null-name");
		
		hashMap.putAll(hashMap2);
		System.out.println("HasMap appended -> " + hashMap);
		
		hashMap.remove(null);
		System.out.println("HasMap null id removed -> " + hashMap);
		
		hashMap.remove("ID009b","Samab");
		System.out.println("HasMap sama* removed -> " + hashMap);

		
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
