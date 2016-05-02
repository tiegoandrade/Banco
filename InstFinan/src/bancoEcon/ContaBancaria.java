package bancoEcon;

/* Classe abstrata que não pode ser instanciada. */
public abstract class ContaBancaria {
	
	/* Atributo que armazena o saldo atual de determinada conta.*/
	protected double saldoAtual = 0.0;
	
	/* Método para realizar um depósito de determinada quantia. */
	public void depositar(double valor){
		saldoAtual += valor;
	}
	
	/* Método para realizar um saque de determinada quantia.*/
	public void sacar(double valor){
		saldoAtual -= valor;
	}
	
	/* Método para realizar uma transferência de uma conta para outra.*/
	public void transferir(double valor, ContaBancaria contaRecebe){
		sacar(valor);
		contaRecebe.depositar(valor);
	}
	
	/* Método abstrato que precisa, obrigatoriamente, 
	 * ser implementado por todas as subclasses.
	 */
	public abstract void calcularSaldo();
}
