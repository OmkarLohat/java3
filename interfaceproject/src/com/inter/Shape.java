package com.inter;

public interface Shape {
	
	double PI=3.142; //automatically public , static and final
	double calculateArea(); //automatically public and abstract
	double calculatePerimeter(); //automatically public and abstract
	default void show()
	{
		System.out.println("This is Shape Application");
	}

}