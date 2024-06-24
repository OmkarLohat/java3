package my.first;
public class Demo {
	private int id;
	private String name;
	private int sal;
	public Demo(int id,String name)
	{
		this.id=id;
		this.name=name;
		this.sal=10000;
	}
	public Demo(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void showDetails()
	{
		System.out.println("EmpID:"+this.id);
		System.out.println("EmpName:"+this.name);
		System.out.println("EmpSal:"+this.sal);
		
	}
	
}
