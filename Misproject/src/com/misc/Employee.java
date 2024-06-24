package com.misc;
public class Employee {
	private int id;
	private String name;
	private int sal;
	
	Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	
	public boolean equals(Object o)
	{
		if(!(o instanceof Employee))
				return false;
		if(o == null)
		{
			return false;
		}
		Employee e=(Employee) o;
		if(this.id==e.id && this.name.equals(e.name) && this.sal==e.sal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return "EMPID: "+ id+"\n EMP Name "+name+" \n Emp Sal: "+sal ;
	}
}
