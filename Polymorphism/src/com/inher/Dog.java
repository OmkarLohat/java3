package com.inher;

public class Dog extends Animal{
	String name;
	Dog(String name)
	{
		this.name=name;
	}
	
	public void makeSound()
	{
		System.out.println(name+" Says Bhow Bhow");
	}
}
