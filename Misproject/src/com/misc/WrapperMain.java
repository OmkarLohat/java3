package com.misc;

public class WrapperMain {
	public static void main(String args[])
	{
		int x=320;
		//Integer ig = new Integer(x); //wrapping or boxing
		// int a = ig.intValue();
		
		Integer ig = x; //autoboxing
		
		ig++; //ig=new Integer(ig.intValue()++)
		int a= ig; //auto unboxing
		
		System.out.println(a);
		
		
		String s="345";
		int b=Integer.parseInt(s);
		System.out.println(b);
	}}
