package com.inher;

public class Student extends Person1 {
	private int studId;
	private int marks;
	public Student(int studId,String name,String address, int marks) {
		super(name,address);
		this.studId = studId;
		this.marks = marks;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void show()
	{
		showDetails();
		System.out.println("Student Id: "+studId);
		System.out.println("Student Marks: "+marks);
	}
	
	
	
}
