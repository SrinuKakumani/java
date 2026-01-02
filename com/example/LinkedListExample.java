package com.example;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linklist=new LinkedList<String>(Arrays.asList("C","C++","Java","Python"));
		for(String lang:linklist)
		{
			System.out.println(lang);
		}
		linklist.addFirst("First");
		linklist.addLast("Last");
		System.out.println(linklist.getFirst());
		System.out.println(linklist.getLast());
		System.out.println("------------------");
		for(String lang:linklist)
		{
			System.out.println(lang);
		}
		linklist.removeFirst();
		linklist.removeFirst();
		linklist.removeLast();
		System.out.println("------------------");
		linklist.offer("CSS");
		System.out.println(linklist.peek());
		for(String lang:linklist)
		{
			System.out.println(lang);
		}

	}

}