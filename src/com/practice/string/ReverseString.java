package com.practice.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Khushboo Gupta"; 
		String rev = "";
		
		int namelength = name.length(); 
		
		for(int i = namelength-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);    
		}
		
		System.out.println(rev);

	}

}
