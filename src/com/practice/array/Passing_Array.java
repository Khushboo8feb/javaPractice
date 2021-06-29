package com.practice.array;

public class Passing_Array {
/*An array can be easily passed to a method as a parameter, just like we pass integers and strings to methods.*/
	public static void main(String[] args) {
		
		String[] aMake = {"BMW", "AUDI", "HONDA", "SUZUKI"};
		//Calling method and passing array as parameter
		
		Print_Array(aMake);
	}
		
		public static void Print_Array(String[] array)
		{
			for(int i=0; i<=array.length-1; i++)
			{
				System.out.println("Prininting all the values of the Array is ------------>"+array[i]);
				
			}
		}
		
		


}
