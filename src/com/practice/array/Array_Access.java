package com.practice.array;

public class Array_Access {

	public static void main(String[] args) {
		
		//Array Declaration
		String[] sMake = {"BMW", "AUDI", "HONDA", "SUZUKI"}; 
		
		//Length of the Array or Size of the Array
		int arraySize = sMake.length;
		 System.out.println("Size of the Array is ------>"  +arraySize);
		 
		 //Access array by index
		 
		 System.out.println("First Element value of the Array -------------->"+sMake[0]);
		 
		 //Access the Last element of the array 
		 		  
		 System.out.println("Last Element value of the Array ------------->" +sMake[arraySize-1]);
		 
		 //Print all values of the Array
		 
		 for(int i=0; i<=sMake.length-1;i++)
		 {
			 System.out.println("Value of the Array on" +i+ "th position----->" +sMake[i]);
		 }
	}

}
