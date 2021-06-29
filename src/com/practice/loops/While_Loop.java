package com.practice.loops;

public class While_Loop {

	public static void main(String[] args) {
		
		int count = 0;
		while(count <=25)
		{
			count = count+5;
			System.out.println("Count is =-----> " +count);
		}
		
		int countOnce = 25;
		System.out.println("<--------------------Next Count------------------->");
		while(countOnce<25)
		{
			countOnce = countOnce+5;
			System.out.println("Count is ==> "+ countOnce);
		}
				

	}

}