import javax.swing.JOptionPane;


public class HeartRateTest
{
	public static void main (String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Bem-vindo ao medidor de frequência cardíaca!");
		
		
		String name = JOptionPane.showInputDialog("Digite seu nome");
		String lastName = JOptionPane.showInputDialog("Digite seu sobrenome");
		int dayOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia que você nasceu"));
		int monthOfBirth= Integer.parseInt(JOptionPane.showInputDialog("Digite o mês que você nasceu"));
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu"));
		
		HeartRates individuo1 = new HeartRates(name, lastName, dayOfBirth, monthOfBirth, yearOfBirth);
		
		
		//poderia fazer um método para isso
		String age = String.format("%d", individuo1.getAge());       
		String heartRate = individuo1.getNormalHeartRateInterval();
		
		JOptionPane.showMessageDialog(null, "Idade: " + age + "\n" + "Batimento recomendado: " + heartRate + "bpm" );
	}
}