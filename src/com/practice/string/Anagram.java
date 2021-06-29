package com.practice.string;

import java.util.Arrays;

//Determine weather two strings are Anagram are not. Anagram strings contain the same charater however there sequencing can be different
public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "Brag";
		String str2 = "Grab";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		
		 char[] string1 = str1.toCharArray();
		 char[] string2 = str2.toCharArray();
		 
		 Arrays.sort(string1);
		 Arrays.sort(string2);
		 if(str1.length() != str2.length())
			{
				System.out.println("Both given strings are not Anagram");
			}
			
		 
		 else if(Arrays.equals(string1, string2))
		 {
			 System.out.println("Both given Strings are Anagram");
		 }
		 else 
		 {
			 System.out.println("Both given Strings are not Anagram");

		 }

	}

}
