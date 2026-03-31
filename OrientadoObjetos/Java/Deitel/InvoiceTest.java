//exercicio 3.12
import javax.swing.JOptionPane;

public class InvoiceTest 
{
	public static void main(String[] args) 
	{
		Invoice fatura1 = new Invoice(1,"memória Ram 8GB", 2, 709.99);
		
		Invoice fatura2 = new Invoice(1,"memória Ram 8GB", -2, -709.99);
		
		//Demonstração fatura 1
		
		int numeroFatura1 = fatura1.getNumber();
		String descricaoFatura1 = fatura1.getDescription();
		int quantidadeFatura1 = fatura1.getQuantity();
		double precoPorUnidadeFatura1 = fatura1.getUnitPrice();
		
		double valorDaFatura1 = fatura1.getInvoiceAmount();
		
		
		String fatura1Mensagem = String.format("Número da fatura: %d%nDescrição: %s%n Quantidade: %d%n Preço por unidade: %.2f %n%n Valor da fatura: %.2f",numeroFatura1, descricaoFatura1, quantidadeFatura1, precoPorUnidadeFatura1 ,valorDaFatura1 );
		JOptionPane.showMessageDialog(null, fatura1Mensagem);
		
		//Demonstração fatura 2
		int numeroFatura2 = fatura2.getNumber();
		String descricaoFatura2 = fatura2.getDescription();
		int quantidadeFatura2 = fatura2.getQuantity();
		double precoPorUnidadeFatura2 = fatura2.getUnitPrice();
		
		double valorDaFatura2 = fatura2.getInvoiceAmount();
		
		
		String fatura2Mensagem = String.format("Número da fatura: %d%nDescrição: %s%n Quantidade: %d%n Preço por unidade: %.2f %n%n Valor da fatura: %.2f",numeroFatura2, descricaoFatura2, quantidadeFatura2, precoPorUnidadeFatura2, valorDaFatura2 );
		JOptionPane.showMessageDialog(null, fatura2Mensagem);
	}
}