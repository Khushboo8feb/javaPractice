package com.practice.basics;

public class OverloadStaticMethod {
	
	static int a = 10;
	static int b = 20;
	
	public static void sum(int a, int b)
	{
		
		int sum = a+b;
		System.out.println("Sum Method with Parameter  "+sum);
	}
	
	public  void sum()
	{
		int sum = a+b;
		System.out.println("Method without Parameter  "+sum);
	}

	public static void main(String[] args) {
		
		//OverloadStaticMethod.sum(); // compile time error as this method is not static means not class level method
		OverloadStaticMethod obj = new OverloadStaticMethod();
		
		obj.sum();
		OverloadStaticMethod.sum(2, 5);

	}

}
