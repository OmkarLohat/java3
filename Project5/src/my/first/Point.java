package my.first;
public class Point {
	int x;
	int y;
	
	public void setX(int x)
	{
		if (x>=0 & x<=79)
		{
			this.x=x;
		}
		else
		{
			System.out.println("Invalid Range");
		}

	}
	public void setY(int y)
	{
		if ( y>=0 & y>=21)
		{
			this.y=y;
		}
		else
		{
			System.out.println("Invalid Range");
		}
	}
	public void show()
	{
		System.out.println("Co-ordinates are: "+this.x+","+this.y);
	}
	
}
