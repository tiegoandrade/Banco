package bancoEcon;

public class ContaInvestimento extends ContaBancaria {
	
	//Atributo que armazena o saldo de determinada conta ap�s realizar ajustes.
	private double saldoFinal;
	 
	// Atributo que armazena o imposto que recai sobre o saldo do correntista.
	private double imposto;
	
	/* 
	 * Construtor que recebe um dep�sito inicial e 
	 * o nome do propriet�rio da conta.
	 */
	public ContaInvestimento(double valor, String nome) {
		this.saldoAtual = valor;
		this.usuarioConta = nome;
	}
	
	// Construtor usado quando n�o h� deposito inicial. 
	public ContaInvestimento(String nome) {
		this.usuarioConta = nome;
	}
	
	/* 
	 * M�todo que calcula o saldo final de uma conta investimento.
	 * Esse m�todo lan�a uma exce��o caso o saldo for zero ou negativo.
	 */
	public void calcularSaldo() throws SaldoInsuficienteException {
		if (saldoAtual <= 0) {
			throw new SaldoInsuficienteException(usuarioConta + ", " + "n�o h� saldo suficiente dispon�vel. Seu saldo atual �: ",saldoAtual);
		}
		
		imposto = saldoAtual * 0.05;
		saldoFinal = saldoAtual - imposto;
		System.out.println(usuarioConta + ", " + "o saldo final sua conta investimento �: " + padraoMoeda(saldoFinal));
	}
}
