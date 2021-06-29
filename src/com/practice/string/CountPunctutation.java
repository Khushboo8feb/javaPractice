package com.practice.string;

//Count the total number of punctutation in a String
public class CountPunctutation {

	public static void main(String[] args) {
		
		int count = 0;
		
		String str = "He said, 'The mailman loves you'. I heard it with my own ears.";
		
		for(int i =0; i<=str.length()-1; i++)
		{
			if(str.charAt(i) == '!' || str.charAt(i) == '_' || str.charAt(i) == '-' || str.charAt(i) == ';' || str.charAt(i) == ':' || str.charAt(i) == '"' || str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '/' || str.charAt(i) == '\'')
			{
				count = count+1;
			}
		}
		
		System.out.println("Total Number of Puctuation in a String is  " +count);

	}

}
