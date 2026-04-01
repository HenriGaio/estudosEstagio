//exercicio 3.12
public class Invoice
{
	int number;
	String description;
	int quantity;
	double unitPrice;
	
	public Invoice(int number, String description, int quantity, double unitPrice) 
	{
		this.number = number;
		this.description = description;
		
		if (quantity > 0) 
			this.quantity = quantity;
		if (unitPrice > 0.0)
			this.unitPrice = unitPrice;
	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
	//set variaveis instancia
	public void setNumber(int number) 
	{
		this.number = number;
	}
	
	public void setDescripton(String description) 
	{
		this.description = description;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	public void setUnitPrice(double unitPrice) 
	{
		this.unitPrice = unitPrice;
	}
	//=-=-====-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-==
	//get variaveis instancia
	public int getNumber()
	{
		return this.number;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public double getUnitPrice()
	{
		return this.unitPrice;
	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
	public double getInvoiceAmount()// Calcula valor total da fatura
	{
		double invoiceAmount = this.quantity * this.unitPrice;
		return invoiceAmount;
	}
}