package my.first;
public class Product {
	
		int Id;
		String name;
		int price;
		int quantity;
		boolean value;
		public Product(int Id,String name, int price,int quantity)
		{
			this.Id=Id;
			this.name=name;
			this.price=price;
			this.quantity=quantity;
			
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public void show()
		{
			System.out.println("product Id:"+Id);
			System.out.println("product Name:"+name);
			System.out.println("product Price:"+price);
			System.out.println("product quantity:"+quantity);
		}
		
		public void check()
		{
			
			if(this.quantity>100)
			{
				 value=true;
			}
			System.out.println(value);
		}
		

}
