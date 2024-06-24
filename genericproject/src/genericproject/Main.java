package genericproject;

public class Main {
	public static void main(String args[])
	{
		GenericStore<Integer> ns=new GenericStore<Integer>();
		
		ns.setValue(23);
		System.out.println(ns.getValue());
		
		GenericStore<String> ss=new GenericStore<String>();
		
		ss.setValue("Omkar");
		System.out.println(ss.getValue());
		
		
	}

}
