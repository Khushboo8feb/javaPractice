package com.practice.polymorphism;

public class MethodOverloading {

	void demo(int a) {
		System.out.println("a : " + a);
	}
	void demo(int a, int b)
	{
		System.out.println("a : " + a + " b: " +b);
	}
	void demo(double a)
	{
		System.out.println("double a : " +a);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.demo(10);
		obj.demo(10,20);
		obj.demo(5.5);

	}

}
