package com.inher;

public class Person1 {
	private String name;
	private String address;
	
	public Person1()
	{
		this.name=null;
		this.address="Delhi";
	}
	public Person1(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void showDetails()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+address);
	}
	
}
