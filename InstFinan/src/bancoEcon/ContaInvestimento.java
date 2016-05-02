package bancoEcon;

public class ContaInvestimento extends ContaBancaria {
	
	/* Atributo que armazena o saldo de 
	 * determinada conta ap�s realizar ajustes.
	 */
	private double saldoFinal = 0.0;
	
	/* Atributo que armazena o imposto que 
	 * recai sobre o saldo do correntista.
	 */
	private double imposto = 0.0;
	
	/* Construtor que recebe um determinado valor com a abertura da conta.*/
	public ContaInvestimento(double valor){
		saldoAtual = valor;
	}
	
	/* M�todo que calcula o saldo final de uma conta investimento.*/
	public void calcularSaldo() {
		imposto = saldoAtual * 0.05;
		saldoFinal = saldoAtual - imposto;
		System.out.println("O saldo final da conta dessa investimento �: " + saldoFinal);
	}
}
