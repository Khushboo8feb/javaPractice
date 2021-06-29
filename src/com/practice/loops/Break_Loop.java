package com.practice.loops;

public class Break_Loop {

	public static void main(String[] args) {
		
		for(int count =0; count<=10; count++)
		{
			if(count == 4)
			{
				break;
			}
			System.out.println("Count is ---->"+count);
		}
		System.out.println("Yoh have existed the loop");

	}

}
