import java.util.Scanner;

public class ReadingInput
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Write something:");
		String message = input.nextLine();
		
		System.out.printf("Your next line is:%s", message);
	}
}