public class Account
{
	private String name;
	private double balance;
	
	public Account(String givenName, double money) 
	{
		name = givenName;
		if (money > 0.0)
			balance = money;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void deposit(double depositAmount) 
	{
		if (depositAmount > 0.0)
			balance += depositAmount;
	}
	
	public double getBalance() 
	{
		return balance;
	}
}