package bancoEcon;

public class ContaCorrente extends ContaBancaria {
	
	// Atributo que armazena o saldo de determinada conta após realizar ajustes.
	private double saldoFinal;
	
	// Atributo que armazena o imposto que recai sobre o saldo do correntista.
	private double imposto;
	
	// Construtor que recebe um determinado valor com a abertura da conta.
	public ContaCorrente(double valor){
		saldoAtual = valor;
	}
	
	// Método que calcula o saldo final de uma conta corrente.
	public void calcularSaldo() {
		imposto = saldoAtual*0.10;
		saldoFinal = saldoAtual - imposto;
		System.out.println("O saldo Final dessa conta corrente é: " + saldoFinal);
	}

}
