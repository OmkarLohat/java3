package listproject;
import java.util.ArrayList;
public class Main {
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Pune");
		list.add("Chennai");
		list.add("Banglore");
		System.out.println(list.size());
		
		list.remove("Chennai");
		list.add(2,"Lucknow");
		list.remove(1);
		list.set(1, "Bhopal");
		
		for(String s:list)
		{
			System.out.println(s);
			
			
		}
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(9);
		num.add(8);
		num.add(5);
		
		for(int i=0;i<num.size();i++)
		{
			System.out.println(num);
		}
	}
}
