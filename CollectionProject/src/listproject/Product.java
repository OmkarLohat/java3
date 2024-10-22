package listproject;

public class Product implements Comparable<Product>{
	private int id;
	private String name;
	private double size;
	 
	public Product(int id, String name, double size) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
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
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", size=" + size + "]";
	}
	@Override
	public int compareTo(Product p) { //to print kinn sorted order we need to first implement comparable interface with argument as Product and then implement this method.
		if(this.id>id)
			return 1;
		if(this.id<id)
			return -1;
		return 0;
	}
	

}
