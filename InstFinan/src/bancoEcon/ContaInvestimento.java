package bancoEcon;

public class ContaInvestimento extends ContaBancaria {
	
	/* Atributo que armazena o saldo de 
	 * determinada conta após realizar ajustes.
	 */
	private double saldoFinal;
	
	/* Atributo que armazena o imposto que 
	 * recai sobre o saldo do correntista.
	 */
	private double imposto;
	
	/* Construtor que recebe um determinado valor com a abertura da conta.*/
	public ContaInvestimento(double valor){
		saldoAtual = valor;
	}
	
	/* Método que calcula o saldo final de uma conta investimento.*/
	public void calcularSaldo() {
		imposto = saldoAtual * 0.05;
		saldoFinal = saldoAtual - imposto;
		System.out.println("O saldo final da conta dessa investimento é: " + saldoFinal);
	}
}
