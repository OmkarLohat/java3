package com.inher;

public class Cat extends Animal{
	String name;
	Cat(String name)
	{
		this.name=name;
	}
	public void makeSound()
	{
		System.out.println(name+" says Meow Meow");
	}

}
