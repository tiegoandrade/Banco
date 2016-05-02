package bancoEcon;

/* Classe abstrata que n�o pode ser instanciada. */
public abstract class ContaBancaria {
	
	/* Atributo que armazena o saldo atual de determinada conta.*/
	protected double saldoAtual = 0.0;
	
	/* M�todo para realizar um dep�sito de determinada quantia. */
	public void depositar(double valor){
		saldoAtual += valor;
	}
	
	/* M�todo para realizar um saque de determinada quantia.*/
	public void sacar(double valor){
		saldoAtual -= valor;
	}
	
	/* M�todo para realizar uma transfer�ncia de uma conta para outra.*/
	public void transferir(double valor, ContaBancaria contaRecebe){
		sacar(valor);
		contaRecebe.depositar(valor);
	}
	
	/* M�todo abstrato que precisa, obrigatoriamente, 
	 * ser implementado por todas as subclasses.
	 */
	public abstract void calcularSaldo();
}
