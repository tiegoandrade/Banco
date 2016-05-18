package bancoEcon;

/*Exce��o que representa um valor inv�lido.*/
public class ValorInvalidoException extends Exception {
	
	private double valorInvalido;
	
	/* 
	 * Construtor que recebe como par�metro o valor inv�lido
	 * e uma mensagem de erro
	 */
	public ValorInvalidoException(String message, double valorInvalido) {
		super(message); // Chama o construtor da super classe Exception passando uma mensagem. 
		this.valorInvalido = valorInvalido;
	}
	
	// M�todo que acessa o valor inv�lido.
	public double getValorInvalido(){
		return valorInvalido;
	}
}
