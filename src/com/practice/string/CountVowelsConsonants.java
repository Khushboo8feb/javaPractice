package com.practice.string;

//Count total number of Vowels and Consonants
public class CountVowelsConsonants {

	public static void main(String[] args) {
		
		String str = "This is really simple sentance";
		
		int vCount = 0, cCount = 0;
		
		str = str.toLowerCase();
		
		for(int i =0; i<=str.length()-1; i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				vCount = vCount+1;
			}
			
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				cCount = cCount+1;
			}
		}
		
		System.out.println("Total Number of Vowels in String  " +vCount+ "and Total number of Consonants in String  " +cCount);

	}

}
