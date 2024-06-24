package com.inher;

public class Employee extends Person1 {
	private int Id;
	private int sal;
	public Employee(int Id,String name,String address, int sal) {
		super(name,address);
		this.Id = Id;
		this.sal = sal;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public int sal() {
		return sal;
	}
	public void setsal(int sal) {
		this.sal = sal;
	}
	public void show()
	{
		showDetails();
		System.out.println("Student Id: "+Id);
		System.out.println("Student Marks: "+sal);
	}
	
	
	
}
