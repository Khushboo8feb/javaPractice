package com.practice.array;

public class AnonymousArray {
	/*Anonymous array means array without any reference.*/


	public static void main(String[] args) {
		
		//Creating anonymous arrays
		 
		System.out.println(new int[]{11, 12, 13, 14, 15}.length); //Output : 5
		 
		System.out.println(new int[]{31, 94, 75, 64, 41}[1]); //Output : 94 }}
		
		int []a = new int[50];
		int []b = new int[30];
		b=a; //Compiler checks only type, not the size
		System.out.println("length of the array b  " +b.length);

	}

}
