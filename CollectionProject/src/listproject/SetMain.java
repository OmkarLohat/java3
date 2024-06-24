package listproject;
import java.util.*;
import java.util.ArrayList;

public class SetMain {
	public static void main(String args[])
	{
		HashSet<String> cities=new HashSet<String>();
	
		cities.add("Pune");
		cities.add("Chennai");
		cities.add("Banglore");
		cities.add("Mumbai");
		cities.add("Bhopal");
		cities.add("Hyderabad");
		cities.add("Hyderabad"); //duplicate entry taken only one time
				
		System.out.println(cities.size());
	
		cities.remove("Chennai");
		// cities.add(2,"Lucknow"); Not allowed
		cities.remove(1);
	//	cities.set(1, "Bhopal"); Not allowed
	
		for(String s:cities)
		{
			System.out.println(s);
		
		
		}
		System.out.println(cities.contains(cities));
	}
}
