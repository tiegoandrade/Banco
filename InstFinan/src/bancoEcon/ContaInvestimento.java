package bancoEcon;

public class ContaInvestimento extends ContaBancaria {
	
	//Atributo que armazena o saldo de determinada conta após realizar ajustes.
	private double saldoFinal;
	 
	// Atributo que armazena o imposto que recai sobre o saldo do correntista.
	private double imposto;
	
	/* 
	 * Construtor que recebe um depósito inicial e 
	 * o nome do proprietário da conta.
	 */
	public ContaInvestimento(double valor, String nome) {
		this.saldoAtual = valor;
		this.usuarioConta = nome;
	}
	
	// Construtor usado quando não há deposito inicial. 
	public ContaInvestimento(String nome) {
		this.usuarioConta = nome;
	}
	
	/* 
	 * Método que calcula o saldo final de uma conta investimento.
	 * Esse método lança uma exceção caso o saldo for zero ou negativo.
	 */
	public void calcularSaldo() throws SaldoInsuficienteException {
		if (saldoAtual <= 0) {
			throw new SaldoInsuficienteException(usuarioConta + ", " + "não há saldo suficiente disponível. Seu saldo atual é: ",saldoAtual);
		}
		
		imposto = saldoAtual * 0.05;
		saldoFinal = saldoAtual - imposto;
		System.out.println(usuarioConta + ", " + "o saldo final sua conta investimento é: " + padraoMoeda(saldoFinal));
	}
}
