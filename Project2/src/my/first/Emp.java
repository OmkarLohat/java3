package my.first;
public class Emp {
	private int id;
	private String name;
	private int sal;
	
	public void setValues(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void showDetails()
	{
		System.out.println("EmpID:"+this.id);
		System.out.println("EmpName:"+this.name);
		System.out.println("EmpSal:"+this.sal);
		
	}
	
}
