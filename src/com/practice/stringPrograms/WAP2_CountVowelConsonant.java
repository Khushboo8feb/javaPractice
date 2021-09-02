package com.practice.stringPrograms;
//count the total number of vowels and consonants in a string
/**
 * Algorithm
Define a string.
Convert the string to lower case so that comparisons can be reduced. Else we need to compare with capital (A, E, I, O, U).
If any character in string matches with vowels (a, e, i, o, u ) then increment the vcount by 1.
If any character lies between 'a' and 'z' except vowels, then increment the count for ccount by 1.
Print both the counts.
 * @param args
 */

public class WAP2_CountVowelConsonant {

	public static void main(String[] args) {
		
		//Counter variable to store the count of vowels and consonant  
        int vCount = 0, cCount = 0;  
      //Declare a string  
        String str = "This is a really simple sentence";  
        //Converting entire string to lower case to reduce the comparisons  
        str = str.toLowerCase();  
        
        for(int i = 0; i<=str.length()-1; i++)
        {
        	if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
        	{  
                //Increments the vowel counter  
                vCount++;  
            }  
            //Checks whether a character is a consonant  

        	else if (str.charAt(i) > 'a' && str.charAt(i)<'z')
        	{
        		//Increments the consonant counter  
                cCount++;  
        	}
        }
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount); 

	}

}
