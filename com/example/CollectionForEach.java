package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionForEach {

	public static void main(String[] args) {
		List<String> books = new ArrayList<>(Arrays.asList("C","Java","Python","JavaScript"));
		//Using iterator
		Iterator<String> itr = books.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Using For-each
		for(String ele:books)
		{
			System.out.println(ele);
		}
	}

}