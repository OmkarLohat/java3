package my.first;

public class Demo {
	public static void main(String args[])
	{
		int arr[]= {10,20,30,40,50};
		int arr2[]=new int[10];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=i;
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}
}
