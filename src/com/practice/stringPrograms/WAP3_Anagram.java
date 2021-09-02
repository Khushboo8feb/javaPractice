package com.practice.stringPrograms;

import java.util.Arrays;

/*
 * Algorithm
Define two strings.
Check for their lengths. If the lengths are not equal, then strings are not an anagram.
Else, convert the string to lower case character to make the comparison easy.
Some language allows the strings to provide inbuilt function for sorting of string. If not then convert them to character array for sorting.
Sort the array.
Finally, check for the equality of content.*/

public class WAP3_Anagram {

	public static void main(String[] args) {
		String str1 = "Grab";
		String str2 = "brag";
		
		//converting the string into LowerCase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//check the length() of the strings and compare
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the strings are not Anagram");
		}
		else
		{
			//converting both the strings to char arrays
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			//sort the array using inbuilt finction
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			//compare both the string arrays using inbuilt function equals()
			
			if(Arrays.equals(string1, string2)==true)
			{
				System.out.println("Both the strings are Anagram");
			}
			else
			{
                System.out.println("Both the strings are not anagram");  

			}
		}
	}

}
