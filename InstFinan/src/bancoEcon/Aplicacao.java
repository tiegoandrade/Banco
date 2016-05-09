package bancoEcon;

public class Aplicacao {

	public static void main(String[] args) {
		
		/*Criação de objetos e chamadas de métodos.*/
		ContaCorrente cc2 = new ContaCorrente("João");
		ContaCorrente cc1 = new ContaCorrente("Alberto");
		
		try {
			cc1.depositar(100);
			System.out.println("Olá! " + cc1.toString() + ", " + "Depósito de R$" 
					+  cc1.valorDepositado + " feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor Inválido " + e.getValorInvalido());
		}
		
		try {
			cc1.depositar(-10);
			System.out.println("Olá! " + cc1.toString() + ", " + "Depósito de R$" 
					+  cc1.valorDepositado + " feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor Inválido: " + e.getValorInvalido());
		}
		
		try {
			cc1.sacar(30);
			System.out.println("Saque realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor Inválido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Saldo Atual da Conta R$" + e.getSaldoDisponivel());
		}
		
		try {
			cc1.sacar(90);
			System.out.println("Saque realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor Inválido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Saldo Atual da conta R$" + e.getSaldoDisponivel());
		}
		
		try {
			cc1.sacar(-5);
			System.out.println("Saque realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Saldo Atual da conta R$" + e.getSaldoDisponivel());
		}
		
		try {
			cc1.transferir(50, cc2);
			System.out.println("Transferência de R$" + cc1.valorTransferido + " da Conta de " 
					+ cc1.toString() + " para a Conta de " + cc2.toString() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			cc1.transferir(50, cc2);
			System.out.println("Transferência de R$" + cc1.valorTransferido + " da Conta de " 
					+ cc1.toString() + " para a Conta de " + cc2.toString() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Saldo Atual da conta R$" + e.getSaldoDisponivel());
		}
		
		try {
			cc1.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			cc2.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		
		
		ContaInvestimento ci1 = new ContaInvestimento("Marcos");
		ContaInvestimento ci2 = new ContaInvestimento("Naldo");
		
		try {
			ci1.depositar(200.00);
			System.out.println("Olá! " + ci1.toString() + ", " + "Depósito de R$" +  ci1.valorDepositado + " feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + ci1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor Inválido " + e.getValorInvalido());
		}
		
		try {
			ci1.sacar(100.00);
			System.out.println("Saque realizado com sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + ci1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor Inválido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + ci1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Saldo Atual da Conta R$" + e.getSaldoDisponivel());
		}
		
		try {
			ci1.transferir(150.00, ci2);
			System.out.println("Transferência de R$" + ci1.valorTransferido + " da Conta de " 
					+ ci1.toString() + " para a Conta de " + ci2.toString() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + ci1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + ci1.toString() + ", " + "Erro: " + e.getMessage() 
					+ ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			ci1.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		try {
			ci2.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}	
	}
}

