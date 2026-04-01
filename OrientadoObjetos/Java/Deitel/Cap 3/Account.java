import javax.swing.JOptionPane;

public class Account
{
	private String name;
	private double balance;
	
	public Account(String name, double balance) 
	{
		this.name = name;
		if (balance > 0.0)
			this.balance = balance;
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
	//exercício 3.11
	public void withdraw(double withdrawAmount) 
	{
		if (balance - withdrawAmount > 0.0) 
		{
			balance -= withdrawAmount;
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "O saque excede o valor contido na conta");
		}
	}
}