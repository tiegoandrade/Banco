package bancoEcon;

// Exce��o que representa saldo insuficiente em uma determinada conta.
public class SaldoInsuficienteException extends Exception {
	
	private double saldoDisponivel;
	
	/* 
	 * Construtor que recebe como par�metro o saldo atual da conta
	 * e uma mensagem de erro
	 */
	public SaldoInsuficienteException(String message, double saldoDisponivel){
		super(message); // Chama o construtor da super classe Exception passando uma mensagem. 
		this.saldoDisponivel = saldoDisponivel;
	}
	
	/* M�todo que acessa o saldo atual da conta*/
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}	
}
