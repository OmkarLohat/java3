package listproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsMain {
	public static void main(String args[])
	{
		ArrayList<Product> list=new ArrayList<>();
		
		list.add(new Product(111,"Television",30000));
		list.add(new Product(112,"Mobile",40000));
		list.add(new Product(113,"WashingMachine",50000));
		list.add(new Product(114,"Refrigerator",60000));
		Collections.sort(list);
		for(Product p:list)
		{
			System.out.println(p);
		}
		
		
	}
}
