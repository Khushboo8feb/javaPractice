package com.practice.stringPrograms;
/*
 * Algorithm
Define a string and define n, i.e., no. of equal parts that string needs to be divided in.
No. of characters (variable chars) in each substring will be found out by dividing the length of the string by n.
If the string cannot be divided into n equal parts, then display an error message.
Else divide the string from i to chars (no. Of character)
Then increment the count by chars and continue dividing the string till you get all the parts of the string.
Print the count*/

public class WAP4_DivideString {

	public static void main(String[] args) {
		
		String str = "aaaabbbbcccc";
		
        //Stores the length of the string  
		int strLength = str.length();
		 //n determines the variable that divide the string in 'n' equal parts  
        int n = 3;  
        int temp = 0, chars = strLength/n;  
        //Stores the array of string  
        String[] equalStr = new String [n];   
        //Check whether a string can be divided into n equal parts
        if(strLength % n != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < strLength; i = i+chars) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }  
    System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
            }  

	}

}
