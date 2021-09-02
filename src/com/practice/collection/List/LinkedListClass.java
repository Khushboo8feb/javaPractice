package com.practice.collection.List;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * It uses a doubly linked list internally to store the elements
 * Allow Duplicate Elements
 * Maintains the insertion order
 * Not Synchronized
 * Manipulation is Fast because No Shifting is required*/
public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Ravi");
		linkedList.add("Vijay");
		linkedList.add("Ravi");
		linkedList.add("Ajay");
		
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
