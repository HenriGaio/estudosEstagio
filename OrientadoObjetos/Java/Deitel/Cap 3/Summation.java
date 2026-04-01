import javax.swing.JOptionPane;

public class Summation
{
	public static void main(String[] args) 
	{	
		int number1;
		int number2;
		int sum;
		String output;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		
		sum = number1 + number2;
		output = String.format("A soma deu %d", sum);
		
		JOptionPane.showMessageDialog(null, output);
				
	}
}