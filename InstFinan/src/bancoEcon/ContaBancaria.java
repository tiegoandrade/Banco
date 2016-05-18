package bancoEcon;

import java.text.NumberFormat;
import java.util.Locale;

/* Classe abstrata que n�o pode ser instanciada. */
public abstract class ContaBancaria {
	
	/* Atributo que armazena o saldo atual de determinada conta.*/
	protected double saldoAtual;
	protected double valorTransferido;
	protected double valorDepositado;
	protected double valorSacado;
	protected String usuarioConta;
	
	/* 
	 * M�todo para realizar um dep�sito de determinada quantia. 
	 * Lan�a uma exce��o caso o valor depositado for negativo ou n�o � depositado valor algum. 
	 */
	public void depositar(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inv�lido para dep�sito", valor);
		}
		
		valorDepositado = valor;
		saldoAtual += valorDepositado;
	}
	
	/* 
	 * M�todo para realizar um saque de determinada quantia.
	 * Lan�a uma exce��o caso o valor depositado for negativo ou n�o � depositado valor algum. 
	 * Lan�a uma exce��o caso n�o haja saldo suficiente para o saque. 
	 */
	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException{
		if (saldoAtual - valor <= 0) {
			throw new SaldoInsuficienteException("N�o h� saldo suficiente dispon�vel", saldoAtual);
		} else if (valor <= 0) {
			throw new ValorInvalidoException("Valor inv�lido para saque", valor);
		}
		
		valorSacado = valor;
		saldoAtual -= valorSacado;
	}
	
	/* 
	 * M�todo para realizar uma transfer�ncia de uma conta para outra.
	 * Possui o lan�amento de exce��es que s�o declarados nos dois m�todos que esse m�todo chama.
	 */
	public void transferir(double valor, ContaBancaria contaRecebe) throws SaldoInsuficienteException, ValorInvalidoException {
		this.valorTransferido = valor;
		sacar(valorTransferido);
		contaRecebe.depositar(valorTransferido);
	}
	
	// Formata a moeda para o padr�o brasileiro.
	public String padraoMoeda(double valor) {
		Locale l = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(l);
		String s = nf.format(valor);
		return s;
	}
	
	/* 
	 * M�todo abstrato que precisa, obrigatoriamente, 
	 * ser implementado por todas as subclasses.
	 * Lan�a uma exce��o caso n�o haja nenhum saldo.
	 */
	public abstract void calcularSaldo() throws SaldoInsuficienteException;
	
	// M�todo que acessa o Valor transferido de uma conta para outra.
	public double getValorTransferido() {
		return valorTransferido;
	}
	
	// M�todo que acessa o Valor depositado em uma determinada conta.
	public double getValorDepositado() {
		return valorDepositado;
	}
	
	// M�todo que acessa o Valor que foi sacado de uma conta.
	public double getValorSacado() {
		return valorSacado;
	}
	
	// M�todo que acessa o nome do usu�rio da conta.
	public String getUsuarioConta() {
		return usuarioConta;
	}
}
