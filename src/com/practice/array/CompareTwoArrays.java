package com.practice.array;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		
		int [] num1 = {1, 2, 3};
		int [] num2 = {1, 2, 4};
		int [] num3 = {1, 2, 3};
		
		//equals() method is comparing the address of the object so false returned 
		System.out.println(num1.equals(num2)); //false
		
		//Arrays.equals() method is comparing the array elements which doesn't matched so false returned 
		System.out.println(Arrays.equals(num1, num2)); //false
		
		//equals() method is comparing the address of the object so false returned 
		System.out.println(num1.equals(num3));// false
		
		//Arrays.equals() method is comparing the array elements which  matched so True returned 

		System.out.println(Arrays.equals(num1, num3)); //True

	}

}
