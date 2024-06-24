package com.inher;

public class Main {
	public static void main(String args[])
	{
		Animal c=new Cat("Oggy");
		c =new Dog("Bob");
		System.out.println("Sound of Dog: ");
		c.makeSound();
		System.out.println("Sound of Cat: ");
		c.makeSound();
		
	}
}
