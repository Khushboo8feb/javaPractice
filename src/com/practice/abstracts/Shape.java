package com.practice.abstracts;

//1.  An abstract class must be declared with an abstract keyword and It cannot be instantiated.
public abstract class Shape {
	
	//2. It can have abstract and non-abstract methods.
	public abstract void draw();
	
	// non-abstract methods.
	public void shapeMaterial()
	{
		System.out.println("To draw any shape used wood material");
	}
	
	public static void  displayMessage()
	{
		System.out.println("Hello Static Method in abstract class");
	}
	
	//4. It can have Constructor 
	Shape(String edge)
	{
		System.out.println("Abstract class constrctor invoked  " +edge);
	}
	
	Shape()
	{
		System.out.println("Abstract class constrctor invoked  " );
	}

}

class Rectangle extends Shape
{

	/*Rectangle(String edge) {
		super(edge);
		System.out.println("Rectangle cons called");
	}*/

	public void draw() {
		System.out.println("Rectangle shape is drawed");
		
	}
	
	public void shapeSize()
	{
		System.out.println("Small rectangle in size");
	}
	
	public static void  displayMessage()
	{
		System.out.println("Hello Static Method from extended sub class"); 
		
	}
	
}

class Circle extends Shape
{

	Circle(String edge) {
		super(edge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		
		System.out.println("Drawing Circle");
		
	}
	
}

class TestAbstraction1
{
	public static void main(String[] args)
	{
		//Shape Obj = new Shape(); //Compile time Error, If we try to instantiate the abstract class
		
		Shape obj = new Rectangle();
		obj.draw();
		obj = new Circle("testcircle");
		obj.draw();
		Rectangle.displayMessage();
		
	}
}
