package com.practice.collection.List;

import java.util.*;  
/*
 * Dynamic Array to store the duplicate element of different data types
 * Maintains the insertion order
 * Non synchronized
 * Can Access Randomly*/

public class ArrayListClass {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
}
