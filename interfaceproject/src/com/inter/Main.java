package com.inter;

public class Main {
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(2,4);
		getDetails(r);
		System.out.println("=========");
		
		
		Square s=new Square(4);
		getDetails(s);
		System.out.println("=========");
		
		
		Circle c=new Circle(3);
		getDetails(c);
	}
	
	static void getDetails(Shape s)
	{
		String name="";
		if(s instanceof Rectangle)
		{
			name="Rectnagle";
		}if(s instanceof Square)
		{
			name="Square";
		}
		if(s instanceof Circle)
		{
			name="circle";
		}
		double area=s.calculateArea();
		double peri=s.calculatePerimeter();
		System.out.println("Object type is "+name);
		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+peri);
	}
}
