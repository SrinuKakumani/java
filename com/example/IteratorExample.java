package com.example;

import java.util.*;

public class IteratorExample {
	public static void main(String[] args)
	{
		List<String> books = new ArrayList<>(Arrays.asList("C","Java","Python","JavaScript"));
		Iterator<String> itr = books.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		itr.remove();
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		System.out.println("second Iterator");
		Iterator<String> itr1 = books.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			System.out.println()
		}
	}

}