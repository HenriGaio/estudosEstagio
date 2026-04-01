import javax.swing.JOptionPane;

public class AccountTest
{
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Criação de conta");
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor inicial"));
		
		Account minhaConta1 = new Account(nome,valor);
		
		double SaldoAtual = minhaConta1.getBalance();
		String mensagem0 = String.format("Seu saldo atual é de %.2f  :p", SaldoAtual);
		JOptionPane.showMessageDialog(null, mensagem0);
		
		
		minhaConta1.deposit(1200.0);
		SaldoAtual = minhaConta1.getBalance();
		String mensagem1 = String.format("Seu saldo atual é de %.2f  :p", SaldoAtual);
		JOptionPane.showMessageDialog(null, mensagem1);
		
		
		minhaConta1.withdraw(320.0);
		SaldoAtual = minhaConta1.getBalance();
		
		String mensagem2 = String.format("Seu saldo atual é de %.2f  :p", SaldoAtual);
		JOptionPane.showMessageDialog(null, mensagem2);
	}
}