package com.practice.collection.List;
/**
 * It implements the last-in-first-out data structure
 * 
 */

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
