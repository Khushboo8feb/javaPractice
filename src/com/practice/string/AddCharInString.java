package com.practice.string;

public class AddCharInString {
	static String str = "Khushboo Gupta";

	public static void main(String[] args) {
		
		System.out.println("Stored String is  " +str);
		int strLength = str.length();
		System.out.println("Length of the String is "+strLength);
		for(int i=strLength-1; i>=0; i--)
		{
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		System.out.println("");
		System.out.println("convert String to StringBuilder and using reverse() method");
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());
		

	}

}
