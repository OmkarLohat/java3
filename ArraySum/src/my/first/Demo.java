package my.first;
public class Demo {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		int sum=0;
		int max=arr[0];
		for(int i:arr)
		{
			sum=sum+i;
			int temp=i;
			if(temp>max)
			{
				max=temp;
			}
			
		}
		System.out.println("Sum of array elements is:"+sum);
		System.out.println("Max no is :"+max);
		
	}
}
