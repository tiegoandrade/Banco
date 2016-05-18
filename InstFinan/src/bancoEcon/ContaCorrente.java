package bancoEcon;

public class ContaCorrente extends ContaBancaria {
	
	/* 
	 * Atributo que armazena o saldo de 
	 * determinada conta ap�s realizar ajustes.
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
	 * M�todo que calcula o saldo final de uma conta corrente.
	 * Esse m�todo lan�a uma exce��o caso o saldo for zero ou negativo.
	 */
	public void calcularSaldo() throws SaldoInsuficienteException {
		if (saldoAtual <= 0) {
			throw new SaldoInsuficienteException("N�o h� saldo suficiente dispon�vel", saldoAtual);
		}
		
		imposto = saldoAtual * 0.10;
		saldoFinal = saldoAtual - imposto;
		System.out.println("O saldo Final da conta corrente de " + usuarioConta + " � " + padraoMoeda(saldoFinal));
	}
}
