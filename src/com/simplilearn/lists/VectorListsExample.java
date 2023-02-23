package com.simplilearn.lists;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class VectorListsExample {

	public static void main(String[] args) {
		
		//Vector
		List<String> vectorList = new Vector<>();
		
		vectorList.add("V1");
		vectorList.add("V2");
		vectorList.add("V3");
		
		System.out.println("Vector List :: " + vectorList);
		
		for (String s: vectorList ) {
			System.out.println("Vector List :: " + s);		
		}
		
		//Stack - LIFO
		List<String> stackList1 = new Stack<>();
		stackList1.add("");
		
		System.out.println("Stack List of type List :: " + stackList1);
		
		Stack<String> stackList2 = new Stack<>();
		stackList2.push("red");
		stackList2.push("green");
		stackList2.push("yellow");
		
		System.out.println("Stack List of type Stack :: " + stackList2);

		for (String s: stackList2) {
			System.out.println("Stack List of type Stack :: " + s);
		}
		
		for (int i=0; i<stackList2.size();i++) {
			System.out.println("Value of index :: " + i + " is " + stackList2.pop());
		}
		
		System.out.println("Stack List of type Stack :: " + stackList2);
		
		//Queue - FIFO
		
		Queue<String> stringQueueWithPriorityQueue = new PriorityQueue<>();
		stringQueueWithPriorityQueue.add("chess");
		stringQueueWithPriorityQueue.add("rugby");
		stringQueueWithPriorityQueue.add("football");
		stringQueueWithPriorityQueue.add("hockey");

		
		System.out.println("Queue with priorityqueues :: " + stringQueueWithPriorityQueue);
		
		Queue<String> stringQueue = new LinkedList<>();
		stringQueue.add("chess");
		stringQueue.add("rugby");
		stringQueue.add("football");
		stringQueue.add("hockey");
		
		System.out.println("Queue with linkedlist :: " + stringQueue);
	}
}
