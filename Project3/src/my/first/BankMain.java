package my.first;

public class BankMain {
	public static void main(String args[])
	{
		Bank b1=new Bank(1,"Omkar",10000);
		b1.deposit(1000);
		b1.withdraw(500);
		b1.balance();
	}

}
