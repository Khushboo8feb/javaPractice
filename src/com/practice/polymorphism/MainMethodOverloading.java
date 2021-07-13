package com.practice.polymorphism;

public class MainMethodOverloading {
	
//	You can have n - number of main methods in a class by method overloading. 
//	But JVM calls main(String[] args) method which receives string array as an argument only.
	public static void main(String[] args) {
		  System.out.println("String args main");
		 }
		 public static void main(int i) {
		  System.out.println("int main");
		 }
		 public static void main(int i1, int i2) {
		  System.out.println("two int main");
		 }
		 public static void main(boolean b) {
		  System.out.println("boolean main");
		 }

}
