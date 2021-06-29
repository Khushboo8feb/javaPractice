package com.practice.string;

//Count the Total Number of characters in String
public class CountCharacters {

	public static void main(String[] args) {
		
		String str = "The Best of both Worlds"; 
		
		int count = 0; 
		
		for(int  i =0; i<=str.length()-1; i++)
		{
			//count the character except space
			if(str.charAt(i) !=' ')
			{
				count++;  //or count = count+1
			}
				
		}
		
		System.out.println("Total Number of Charaters in given String are:  "+count);

	}

}
