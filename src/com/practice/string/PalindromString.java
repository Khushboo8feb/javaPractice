package com.practice.string;

public class PalindromString {

	public static void main(String[] args) {
		
		String name = "mwadaM";
		String palindrom = "";
		
		for(int i = name.length()-1; i>=0; i--)
		{
			palindrom = palindrom+name.charAt(i);
		}
		System.out.println(palindrom);
		
		if(palindrom.equalsIgnoreCase(name))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");

		}
				 
	}

}
