package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> books = new ArrayList<>(Arrays.asList("C","Java","Python","JavaScript"));
		ListIterator<String> listItr = books.listIterator();
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
		
	}

}