package com.simplilearn.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue - FIFO
		// if queue is empty, do not use element, it will throw exception
		Queue<String> stringQueue = new PriorityQueue<>();
		stringQueue.add("Ram");
		stringQueue.add("Alex");
		stringQueue.add("John");
		stringQueue.add("Warna");
		
		System.out.println("on the queue - " + stringQueue);
		System.out.println("Head of the Queue using Element :: " + stringQueue.element());
		System.out.println("on the queue - " + stringQueue);
		System.out.println("Head of the Queue using Peek :: " + stringQueue.peek());
		System.out.println("on the queue - " + stringQueue);
		System.out.println("Remove elements using remove fuction :: " + stringQueue.remove());
		System.out.println("on the queue - " + stringQueue);
		System.out.println("Remove elements using poll fuction :: " + stringQueue.poll());
		System.out.println("on the queue - " + stringQueue);
		
		Iterator queueIterator = stringQueue.iterator();
		while (queueIterator.hasNext()) {
			System.out.println("Iterator queue : " + queueIterator.next());
		}
 
	}

}
