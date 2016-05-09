package bancoEcon;

public class ContaInvestimento extends ContaBancaria {
	
	/* 
	 * Atributo que armazena o saldo de 
	 * determinada conta ap�s realizar ajustes.
	 */
	private double saldoFinal;
	private String usuario_conta;
	
	/* 
	 * Atributo que armazena o imposto que 
	 * recai sobre o saldo do correntista.
	 */
	private double imposto;
	
	/* Construtor que recebe um determinado valor com a abertura da conta.*/
	public ContaInvestimento(double valor, String nome){
		saldoAtual = valor;
		usuario_conta = nome;
	}
	
	public ContaInvestimento(String nome) {
		usuario_conta = nome;
	}
	
	public String toString(){
		return usuario_conta;
	}
	
	/* 
	 * M�todo que calcula o saldo final de uma conta investimento.
	 * Esse m�todo lan�a uma exce��o caso o saldo for zero ou negativo.
	 */
	public void calcularSaldo() throws SaldoInsuficienteException {
		if (saldoAtual <= 0) {
			throw new SaldoInsuficienteException("N�o h� saldo suficiente dispon�vel",saldoAtual);
		}
		
		imposto = saldoAtual * 0.05;
		saldoFinal = saldoAtual - imposto;
		System.out.println("O saldo final da conta dessa investimento �: " + saldoFinal);
	}
}
