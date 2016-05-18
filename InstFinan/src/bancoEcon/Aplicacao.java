package bancoEcon;

public class Aplicacao {

	public static void main(String[] args) {
		
		/* Criação de objetos, chamadas de métodos e tratamento de exceções. */
		ContaCorrente cc2 = new ContaCorrente("João");
		ContaCorrente cc1 = new ContaCorrente("Alberto");
		
		try {
			cc1.depositar(100);
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "O Depósito de " 
								+ cc1.padraoMoeda(cc1.getValorDepositado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inválido " + e.getValorInvalido());
		}
		
		try {
			cc1.depositar(-10);
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "O Depósito de " 
								+ cc1.padraoMoeda(cc1.getValorDepositado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inválido: " + e.getValorInvalido());
		}
		
		try {
			cc1.sacar(30);
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "O Saque de " 
								+ cc1.padraoMoeda(cc1.getValorSacado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inválido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Saldo Atual da Conta é: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.sacar(90);
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "O Saque de " 
								+ cc1.padraoMoeda(cc1.getValorSacado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inválido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Saldo Atual da Conta é: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.sacar(-5);
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "O Saque de " 
								+ cc1.padraoMoeda(cc1.getValorSacado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Saldo Atual da Conta é: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.transferir(50, cc2);
			System.out.println("Transferência de " + cc1.padraoMoeda(cc1.valorTransferido) + " da Conta de " 
								+ cc1.getUsuarioConta() + " para a Conta de " + cc2.getUsuarioConta() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro na transferência: " + e.getMessage() 
								+ ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro na transferência: " + e.getMessage() 
								+ ". Saldo Atual da Conta é: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.transferir(50, cc2);
			System.out.println("Transferência de " + cc1.padraoMoeda(cc1.valorTransferido) + " da Conta de " 
								+ cc1.getUsuarioConta() + " para a Conta de " + cc2.getUsuarioConta() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro na transferência: " + e.getMessage() 
								+ ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + cc1.getUsuarioConta() + ", " + "Erro na transferência: " + e.getMessage() 
								+ ". Saldo Atual da Conta é: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc1.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			cc2.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + cc1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		System.out.println("\n");
		
		ContaInvestimento ci1 = new ContaInvestimento("Marcos");
		ContaInvestimento ci2 = new ContaInvestimento("Naldo");
		
		try {
			ci1.depositar(200.00);
			System.out.println("Olá! " + ci1.getUsuarioConta() + ", " + "O Depósito de " 
								+ ci1.padraoMoeda(ci1.getValorDepositado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + ci1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inválido " + e.getValorInvalido());
		}
		
		try {
			ci1.sacar(100.00);
			System.out.println("Olá! " + ci1.getUsuarioConta() + ", " + "O Saque de " 
								+ ci1.padraoMoeda(ci1.getValorSacado()) + " foi feito com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + ci1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor Inválido " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + ci1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Saldo Atual da Conta é: " + ci1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			ci1.transferir(150.00, ci2);
			System.out.println("Transferência de " + ci1.padraoMoeda(ci1.valorTransferido) + " da Conta de " 
								+ ci1.getUsuarioConta() + " para a Conta de " + ci2.getUsuarioConta() + " feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Olá! " + ci1.getUsuarioConta() + ", " + "Erro: " + e.getMessage() 
								+ ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Olá! " + ci1.getUsuarioConta() + ", " + "Erro na transferência: " + e.getMessage() 
								+ ". Saldo Atual da Conta é: " + ci1.padraoMoeda(e.getSaldoDisponivel()));;
		}
		
		try {
			ci1.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + ci1.padraoMoeda(e.getSaldoDisponivel()));
		}
		
		try {
			ci2.calcularSaldo();
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + ci2.padraoMoeda(e.getSaldoDisponivel()));
		}	
	}
}

