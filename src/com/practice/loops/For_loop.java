package com.practice.loops;

public class For_loop {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++)
		{
			System.out.println("Increment Count is ----->"+i);
		}
		System.out.println("<--------------------------Next Count ---------------->");
		
		for(int i=10; i>=1; i--)
		{
			System.out.println("Decrement Count is ------>"+i);
		}
		
		System.out.println("<--------------------------Next Count----------------->");
		
		for(int i=0; i<=10; i+=2)
		{
			System.out.println("Skip every one another ----->"+i);
		}

	}

}
