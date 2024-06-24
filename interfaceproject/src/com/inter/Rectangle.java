package com.inter;

public class Rectangle implements Shape {
	private double length;
	private double width;
	
	
	public Rectangle(double lenght,double width)
	{
		super();
		this.length=lenght;
		this.width=width;
		
	}

	@Override
	public double calculateArea() {
		return this.length*this.width;
		
	}

	@Override
	public double calculatePerimeter() {
		return 2*(this.length+this.width);
		
	}

}
