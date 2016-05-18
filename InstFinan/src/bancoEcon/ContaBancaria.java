package bancoEcon;

import java.text.NumberFormat;
import java.util.Locale;

/* Classe abstrata que não pode ser instanciada. */
public abstract class ContaBancaria {
	
	/* Atributo que armazena o saldo atual de determinada conta.*/
	protected double saldoAtual;
	protected double valorTransferido;
	protected double valorDepositado;
	protected double valorSacado;
	protected String usuarioConta;
	
	/* 
	 * Método para realizar um depósito de determinada quantia. 
	 * Lança uma exceção caso o valor depositado for negativo ou não é depositado valor algum. 
	 */
	public void depositar(double valor) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para depósito", valor);
		}
		
		valorDepositado = valor;
		saldoAtual += valorDepositado;
	}
	
	/* 
	 * Método para realizar um saque de determinada quantia.
	 * Lança uma exceção caso o valor depositado for negativo ou não é depositado valor algum. 
	 * Lança uma exceção caso não haja saldo suficiente para o saque. 
	 */
	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException{
		if (saldoAtual - valor <= 0) {
			throw new SaldoInsuficienteException("Não há saldo suficiente disponível", saldoAtual);
		} else if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para saque", valor);
		}
		
		valorSacado = valor;
		saldoAtual -= valorSacado;
	}
	
	/* 
	 * Método para realizar uma transferência de uma conta para outra.
	 * Possui o lançamento de exceções que são declarados nos dois métodos que esse método chama.
	 */
	public void transferir(double valor, ContaBancaria contaRecebe) throws SaldoInsuficienteException, ValorInvalidoException {
		this.valorTransferido = valor;
		sacar(valorTransferido);
		contaRecebe.depositar(valorTransferido);
	}
	
	// Formata a moeda para o padrão brasileiro.
	public String padraoMoeda(double valor) {
		Locale l = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(l);
		String s = nf.format(valor);
		return s;
	}
	
	/* 
	 * Método abstrato que precisa, obrigatoriamente, 
	 * ser implementado por todas as subclasses.
	 * Lança uma exceção caso não haja nenhum saldo.
	 */
	public abstract void calcularSaldo() throws SaldoInsuficienteException;
	
	// Método que acessa o Valor transferido de uma conta para outra.
	public double getValorTransferido() {
		return valorTransferido;
	}
	
	// Método que acessa o Valor depositado em uma determinada conta.
	public double getValorDepositado() {
		return valorDepositado;
	}
	
	// Método que acessa o Valor que foi sacado de uma conta.
	public double getValorSacado() {
		return valorSacado;
	}
	
	// Método que acessa o nome do usuário da conta.
	public String getUsuarioConta() {
		return usuarioConta;
	}
}
