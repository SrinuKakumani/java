package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>(Arrays.asList(1,5,3,8,5,7));
		Iterator<Integer> itr1=list1.iterator();
		while(itr1.hasNext())
		{
			System.out.println("itr1: " + itr1.next());
		}
		Iterator<Integer> itr2=list1.iterator();
		list1.remove(0);  
		try {
			while(itr2.hasNext())
			{
				System.out.println("itr2: " + itr2.next());
			}
		} catch (java.util.ConcurrentModificationException e) {
			System.out.println("Caught ConcurrentModificationException: " + e.getMessage());
			System.out.println("This demonstrates fail-fast behavior - iterator detects modification");
			System.out.println("\nCreating new iterator after modification:");
			Iterator<Integer> itr3 = list1.iterator();
			while(itr3.hasNext())
			{
				System.out.println("itr: " + itr3.next());
			}
		}
	}
}