package com.example;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		// stack.add("C");
		System.out.println(stack.isEmpty());
		
		stack.push("Java"); 
		stack.push("python"); 

		System.out.println(stack.isEmpty());

		for(String ele:stack)
		{
			System.out.println(ele);
		}
		stack.pop();
		for(String ele:stack)
		{
			System.out.println(ele);
		}
		System.out.println(stack.peek());

	}

}