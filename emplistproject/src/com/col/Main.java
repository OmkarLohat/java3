package com.col;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
	public static void main(String args[])
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(101,"Omkar",20000,10,LocalDate.of(1989, 12,1)));
		list.add(new Employee(102,"Shiv",30000,20,LocalDate.of(1989, 12,1)));
		list.add(new Employee(103,"Sanket",25000,10,LocalDate.of(1989, 12,1)));
		list.add(new Employee(104,"Raje",50000,29,LocalDate.of(1989, 12,1)));
		
		
		
		Collections.sort(list);
		Collections.sort(list,new DobComparator());
		Collections.sort(list,new SalComparator());
		
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
		
		
		
	}
}



class DobComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getDob().compareTo(e2.getDob());
		
	}
	
}

class SalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSal()>e2.getSal())
			return 1;
		if(e1.getSal()<e2.getSal())
			return -1;
		return 0;
		
	}
	
}
