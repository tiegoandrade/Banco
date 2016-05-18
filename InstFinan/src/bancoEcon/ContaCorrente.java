package bancoEcon;

public class ContaCorrente extends ContaBancaria {
	
	/* 
	 * Atributo que armazena o saldo de 
	 * determinada conta após realizar ajustes.
	 */
	private double saldoFinal;

	/* 
	 * Atributo que armazena o imposto 
	 * que recai sobre o saldo do correntista.
	 */
	private double imposto;
	
	/* Construtor que recebe um determinado valor com a abertura da conta. */
	public ContaCorrente(double valor, String nome) {
		this.saldoAtual = valor;
		this.usuarioConta = nome;
	}
	
	public ContaCorrente(String nome) {
		this.usuarioConta = nome;
	}
	
	/* 
	 * Método que calcula o saldo final de uma conta corrente.
	 * Esse método lança uma exceção caso o saldo for zero ou negativo.
	 */
	public void calcularSaldo() throws SaldoInsuficienteException {
		if (saldoAtual <= 0) {
			throw new SaldoInsuficienteException("Não há saldo suficiente disponível", saldoAtual);
		}
		
		imposto = saldoAtual * 0.10;
		saldoFinal = saldoAtual - imposto;
		System.out.println("O saldo Final da conta corrente de " + usuarioConta + " é " + padraoMoeda(saldoFinal));
	}
}
