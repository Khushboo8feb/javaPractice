package com.practice.array;

public class AscendingOrderOfArray {

	public static void main(String[] args) {
		//1. Declare and Initialize the Array
		int a[] = {10, 45, 2, 3, 89, 1};
		int temp;
		System.out.print("Before sorting the elements in Array:  ");
		
		for(int i =0; i<a.length; i++)
		{
			System.out.print(" "+a[i]+" ");
		}
		System.out.println("\n");
		
		System.out.print("After sorting the elements in Array:  ");
		//Outer loop to pick one element of the array
		for(int i = 0; i<a.length; i++) //10
		{
			//Inner loop to compare the picked element with each and every next element
			for(int j = i+1; j<a.length; j++)//2
			{
				if(a[i]>a[j]) // 10>2 True
				{
					temp=a[i]; //10
					a[i]=a[j]; //2
					a[j]=temp; //10
				}
			}
		}
		
		//To print the Array after Sorting the array 
		for(int i =0; i<a.length; i++)
		{
			System.out.print(" "+a[i]+" ");
		}


	}
}
