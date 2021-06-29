package com.practice.array;

public class Returning_Array {

	public static void main(String[] args) {
		
		String[] aMake = ReturnArray();
		
		for(int i =0; i<=aMake.length-1; i++)
		{
			System.out.println("Printing all tha values in Array ---->" +aMake[i]);
			
		}

	}
	public static String[] ReturnArray()
	{
		String[] aArray = {"BMW", "AUDI", "HONDA"};
		return aArray;
		
	}

}
