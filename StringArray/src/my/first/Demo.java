package my.first;
public class Demo {
	public static void main(String args[])
	{
		String state[]=new String[3];
		state[0]="Maharsahtra";
		state[1]="Gujrat";
		state[2]="Delhi";
		for(int i=0;i<state.length;i++)
		{
			System.out.println(state[i]);
		}
		String city[]= {"Pune","Mumbai","Hyderabad","Bangalore"};
		for(String cities:city)
		{
			System.out.println("First letter of "+cities+" is: "+cities.charAt(0));
		}
		
	}
}
