package com.maps;
import java.time.LocalDate;
public class Employee implements Comparable<Employee> {
	private int empid;
	private String name;
	private int sal;
	private LocalDate dob;
	public Employee(int empid, String name, int sal, LocalDate dob) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
		this.dob = dob;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + ", dob=" + dob + "]";
	}
	@Override
	public int compareTo(Employee e) {
		if(this.empid>empid)
			return 1;
		if(this.empid<empid)
			return -1;
		
		return 0;
	}
	
	
}