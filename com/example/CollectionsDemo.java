package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		List<String> names2=new ArrayList<>();
		List<String> list1=new ArrayList<>(Arrays.asList("AB","BC","CD"));
		List<String> list2=new ArrayList<>(Arrays.asList("AB","CD","BC"));

		names2.add("Ravi");
		names2.add("Vijay");
		names2.add("Rahul");
		//adding single element
		names.add("Rahul");
		//adding multiple elements
		names.addAll(names2);
		//size of the collection
        System.out.println("Size of the collection: ");
		System.out.println(names.size());
		//check weather list is empty or not
		System.out.println(names.isEmpty());
		//check 2 collections are equal or not
		System.out.println(list1.equals(list2));
		//removing element from the collection
		list2.remove("CD");
		System.out.println(list2);
		//removing multiple elements from the collection
		list1.removeAll(list2);
		System.out.println(list1);
		//want to check weather given object is present in collection or not
		System.out.println(names.contains("Vijay"));
		//want to check multiple elements are present in  collection or not
		System.out.println(list2.containsAll(list1));
		//I want remove all the elements from the collection
		list1.clear();
		System.out.println(list1);
		names.add("Jithesh");
		System.out.println(names);
		System.out.println(names2);
		names.retainAll(names2);
		System.out.println(names);
		System.out.println(names2);
		//Iterator
		Iterator<String> it=names2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		


		
		
	}

}