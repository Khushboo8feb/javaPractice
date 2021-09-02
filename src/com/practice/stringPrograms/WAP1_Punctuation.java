package com.practice.stringPrograms;
//count the total number of punctuation characters exists in a string
/*
 * Algorithm
Define a string.
If any character in the string is matched with (! , . , ' , - , " , ? , ; ) , increment the count by 1.
Print the count*/

public class WAP1_Punctuation {

	public static void main(String[] args) {
		
		String str = "Good Morning! Mr. James Potter. Had your breakfast?";
		int countPuncMarks = 0;
		
		for(int i =0; i<=str.length()-1; i++)
		{
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
			{
				countPuncMarks++;
			}
		}
		System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);

	}

}
