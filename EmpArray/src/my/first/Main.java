package my.first;

public class Main {
	public static void main(String args[])
	{
		Demo[] d1= {
				new Demo(1,"Omkar",10000),
				new Demo(2,"Shiv",11000),
				new Demo(3,"Sanket",12000)
				};
		int total=0;
		for(Demo d:d1)
		{
			total=total+d.getSal();
			System.out.println(d.getName()+" "+d.getSal());
		}
		
		System.out.println("Total salaries="+total);
		
		
	}
}
