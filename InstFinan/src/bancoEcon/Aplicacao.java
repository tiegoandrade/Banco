package bancoEcon;

public class Aplicacao {

	public static void main(String[] args) {
		
		/*Criação de objetos e chamadas de métodos.*/
		ContaCorrente cc2 = new ContaCorrente(100.00);
		ContaCorrente cc1 = new ContaCorrente(400);
		cc1.depositar(500.00);
		cc1.sacar(100.00);
		cc1.transferir(200.00, cc2);
		System.out.println (" Conta Corrente 1: ");
		cc1.calcularSaldo();
		System.out.println (" \nConta Corrente 2: ");
		cc2.calcularSaldo();
		System.out.println();
		
		ContaInvestimento ci1 = new ContaInvestimento(200.0);
		ContaInvestimento ci2 = new ContaInvestimento(200.0);
		ci1.depositar(200.00);
		ci1.sacar(100.00);
		ci1.transferir(150.00, ci2);
		System.out.println (" Conta Investimento 1: ");
		ci1.calcularSaldo();
		System.out.println (" \nConta Investimento 2: ");
		ci2.calcularSaldo();
		
		
	}

}
