package com.practice.array;

public class Solution {
	
	
	    public static int solution(int N, int[]a) {
	        // write your code in Java SE 8
	        int temp;
	        for(int i =0; i<N; i++)
	        {
	            for(int j = i+1; j<N; j++)
	            {
	                if(a[i]>a[j])
	                {
	                    temp=a[i];
	                    a[i]=a[j];
	                    a[j]=temp;
	                }
	            }
	        }
	        return a[0];
	    }

	    public static void main(String args[])
	    {
	        int a[] = {10, 567, 99, 456};
	        System.out.println(solution(4, a));


	    }
	}


