package com.misc;

public class Main {
	public static void main(String args[])
	{
		Employee e1=new Employee(1000,"Omkar",10000);
		Employee e2=new Employee(1000,"Omkar",10000);
		if(e1.equals(e2))
		{
			System.out.println("Objects are equal");
			
		}
		else
		{
			System.out.println("Objects are not equal");
		}
		System.out.println(e1);
	}
	
	
}