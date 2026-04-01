public class HeartRates
{
	private String name;
	private String lastName;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	
	
	public HeartRates(String name, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) 
	{
		this.name = name;
		this.lastName = lastName;
		
		if (dayOfBirth > 0 && dayOfBirth < 32)
			this.dayOfBirth = dayOfBirth;
		
		if (monthOfBirth > 0 && monthOfBirth < 13)
			this.monthOfBirth = monthOfBirth;
		
		if (yearOfBirth > 1900 && yearOfBirth < 2100)
			this.yearOfBirth = yearOfBirth;
	}
	
	//métodos set
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public void setDayOfBirth(int dayOfBirth) 
	{
		this.dayOfBirth = dayOfBirth;
	}
	
	public void setMonthOfBirth(int monthOfBirth) 
	{
		this.monthOfBirth = monthOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) 
	{
		this.yearOfBirth = yearOfBirth;
	}
	
	//métodos get
	
	public String getName() 
	{
		return this.name;
	}
	
	public String getLastName() 
	{
		return this.lastName;
	}
	
	public int getDayOfBirth() 
	{
		return this.dayOfBirth;
	}
	
	public int getMonthOfBirth() 
	{
		return this.monthOfBirth;
	}
	
	public int getYearOfBirth() 
	{
		return this.yearOfBirth;
	}
	
	
	//demais métodos
	
	public int getAge() 
	{
		int age;
		
		int currentDay = 1;
		int currentMonth = 4;
		int currentYear = 2026;
		
		if (monthOfBirth < currentMonth) 
		{
			age = currentYear - this.yearOfBirth;
		}
		else if (monthOfBirth == currentMonth)
		{
			if (dayOfBirth <= currentDay) 
			{
				age = currentYear - this.yearOfBirth;
			}
			else
			{
				age = currentYear - this.yearOfBirth - 1;
			}
		}
		else 
		{
			age = currentYear - this.yearOfBirth - 1;
		}
		
		return age;
	}
	
	public int getMaxHeartRate()
	{
		int maxHeartRate = 220 - this.getAge();
		return maxHeartRate;
	}
	
	public String getNormalHeartRateInterval()
	{
		String lowRate = String.format("%.0f", this.getMaxHeartRate() * 0.5);
		String highRate = String.format("%.0f", this.getMaxHeartRate() * 0.85);
		
		String normalHeartRateInterval = lowRate + "~" + highRate;
		
		return normalHeartRateInterval;
	}
}