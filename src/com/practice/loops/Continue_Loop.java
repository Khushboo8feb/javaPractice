package com.practice.loops;

public class Continue_Loop {

	public static void main(String[] args) {
		
		 // This will print -- 0,1,2,4,5
		for(int count =0; count <=5; count++)
		{
			if(count==3)
			{
				continue;
			}
			System.out.println("Count is ------>" +count);
		}
		System.out.println("<-----------------------Next Count----------------------->");
		
		 // This will just print -- 3
		for(int count =0; count <=5; count++)
		{
			if(count==3)
			{
				System.out.println("Count is ------>" +count);
				continue;
			}
			
		}

	}

}
