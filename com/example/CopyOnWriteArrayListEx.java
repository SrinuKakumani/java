package com.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

	public static void main(String[] args) {
		List<String> books = new CopyOnWriteArrayList<>(Arrays.asList("C","C++","Java"));
		Iterator<String> itr = books.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		books.add("JavaScript");
		Iterator<String> itr1 = books.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}