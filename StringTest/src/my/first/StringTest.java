package my.first;

public class StringTest {
	public static void main(String args[])
	{
		String s1="Omkar";
		String s2="Ramana";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareTo(s2));
		
		StringBuilder s3=new StringBuilder("Om");
		StringBuilder s4=new StringBuilder("Rama");
		System.out.println(s3.length());
		System.out.println(s3.charAt(1));
		System.out.println(s3.append(s4));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3);
		System.out.println(s3.insert(0,"Hi"));
		
		
		
		
		
	}
}
