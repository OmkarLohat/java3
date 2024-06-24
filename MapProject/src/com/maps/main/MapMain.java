package com.maps.main;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.maps.Employee;

public class MapMain {
	public static void main(String args[])
	{
		Employee e;
		HashMap<Integer,Employee> data=new HashMap<>();
		data.put(100, new Employee(100,"Omkar", 100000, LocalDate.of(2003, 8, 14)));
		data.put(101, new Employee(101,"Shiva", 100002, LocalDate.of(2003, 4, 28)));
		data.put(102, new Employee(102,"Sanket", 200000, LocalDate.of(2003, 12, 22)));
		data.put(103, new Employee(103,"Rajesh", 10000, LocalDate.of(2002, 3, 20)));
		
		//e=data.get(100);
		//System.out.println(e);
		//data.remove(103);
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the ID of employee you want?(0 to stop)");
			
			int a=sc.nextInt();
			e=data.get(a);
			if(a==0)
				break;
		
			if(e==null)
				System.out.println("Emplyee with " +a+" not found");
			else
				System.out.println(e);
			}
		}
	}


