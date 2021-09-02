package com.practice.collection.List;

import java.util.Iterator;
import java.util.Vector;

/*
 * Dynamic array to store the elements
 * It is synchronized*/

public class VectorClass {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("Ravi");
		vector.add("Ajay");
		vector.add("Ravi");
		vector.add("Vijay");
		
		Iterator<String> itr = vector.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
