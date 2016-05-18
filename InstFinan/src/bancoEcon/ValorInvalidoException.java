package bancoEcon;

/*Exceção que representa um valor inválido.*/
public class ValorInvalidoException extends Exception {
	
	private double valorInvalido;
	
	/* 
	 * Construtor que recebe como parâmetro o valor inválido
	 * e uma mensagem de erro
	 */
	public ValorInvalidoException(String message, double valorInvalido) {
		super(message); // Chama o construtor da super classe Exception passando uma mensagem. 
		this.valorInvalido = valorInvalido;
	}
	
	// Método que acessa o valor inválido.
	public double getValorInvalido(){
		return valorInvalido;
	}
}
